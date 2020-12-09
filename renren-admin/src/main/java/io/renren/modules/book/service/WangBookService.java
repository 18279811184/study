package io.renren.modules.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.book.entity.WangBookEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-12-08 09:06:33
 */
public interface WangBookService extends IService<WangBookEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

