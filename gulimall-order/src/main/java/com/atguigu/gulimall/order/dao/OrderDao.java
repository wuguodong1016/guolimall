package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wugd
 * @email 1158732677@qq.com
 * @date 2020-06-26 17:15:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
