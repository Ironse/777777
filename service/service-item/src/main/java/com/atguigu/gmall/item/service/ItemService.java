package com.atguigu.gmall.item.service;

import java.util.Map;


public interface ItemService {

    /*
      构建数据接口 方法的参数，方法的返回值
      当前这个接口做的是数据汇总：
        以下数据是由service-prodcut 提供！
            分类数据：
            skuInfo
            skuImage
            ...
     */
    Map<String,Object> getBySkuId(Long skuId);



}
