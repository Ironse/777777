package com.atguigu.gmall.list.repository;

import com.atguigu.gmall.model.list.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


//  Goods.class 操作es 的对应的实体  T=Goods , ID=Long
//  GoodsRepository继承了 CrudRepository 对Goods 进行curd 方法。
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
