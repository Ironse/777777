package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseTrademark;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


public interface BaseTrademarkService extends IService<BaseTrademark> {

    //  编写接口： 查询品牌的分页列表
    //  需要传入 page,limit
    //  service 服务层接口 get save 等词语。 如果是mapper层， insert ，select ,delete等词语开头。
    IPage<BaseTrademark> getPage(Page<BaseTrademark> baseTrademarkPage);

    //  save 方法

    //  remove 方法
}
