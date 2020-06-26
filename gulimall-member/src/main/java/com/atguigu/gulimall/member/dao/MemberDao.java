package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wugd
 * @email 1158732677@qq.com
 * @date 2020-06-26 17:20:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
