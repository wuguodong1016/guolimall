package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wugd
 * @email 1158732677@qq.com
 * @date 2020-06-26 17:23:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
