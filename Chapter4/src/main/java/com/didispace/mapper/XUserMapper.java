package com.didispace.mapper;

import com.didispace.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Yuanping on 2017/11/26.
 */

/**
 * 在接口上，添加@Mapper注解，声明对应接口是一个Mapper
 */
@Mapper
public interface XUserMapper {
    User findById(@Param("id") Integer id);

    int insert(@Param("name") String name, @Param("age") Integer age);

    int update(User user);

    int delete(Long id);
}
