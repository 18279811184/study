package io.renren.modules.book.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.book.dao.WangBookDao;
import io.renren.modules.book.entity.WangBookEntity;
import io.renren.modules.book.service.WangBookService;


@Service("wangBookService")
public class WangBookServiceImpl extends ServiceImpl<WangBookDao, WangBookEntity> implements WangBookService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WangBookEntity> page = this.page(
                new Query<WangBookEntity>().getPage(params),
                new QueryWrapper<WangBookEntity>()
        );

        return new PageUtils(page);
    }

}
