package io.renren.modules.book.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.book.entity.WangBookEntity;
import io.renren.modules.book.service.WangBookService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-12-08 09:06:33
 */
@RestController
@RequestMapping("book/wangbook")
public class WangBookController {
    @Autowired
    private WangBookService wangBookService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("book:wangbook:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wangBookService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{bookId}")
    @RequiresPermissions("book:wangbook:info")
    public R info(@PathVariable("bookId") String bookId){
        WangBookEntity wangBook = wangBookService.getById(bookId);

        return R.ok().put("wangBook", wangBook);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("book:wangbook:save")
    public R save(@RequestBody WangBookEntity wangBook){
        wangBookService.save(wangBook);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("book:wangbook:update")
    public R update(@RequestBody WangBookEntity wangBook){
        ValidatorUtils.validateEntity(wangBook);
        wangBookService.updateById(wangBook);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("book:wangbook:delete")
    public R delete(@RequestBody String[] bookIds){
        wangBookService.removeByIds(Arrays.asList(bookIds));

        return R.ok();
    }

}
