package com.wxl.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangxl
 * @since 2022/10/18 20:17
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
