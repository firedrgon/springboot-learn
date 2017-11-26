package com.didispace.mapper;

import com.didispace.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by Yuanping on 2017/11/26.
 */
@Mapper
public interface UserMapper {

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "id", column = "id")
    })
    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);

    @Insert("insert into user(name,age) values(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Update("update user set age = #{age},name = #{name} where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{id)")
    int delete(Integer id);
}





















