package com.didispace.respository;

import com.didispace.domain.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * 继承Repository接口
 * Created by Yuanping on 2017/11/23.
 */
public interface Cat2Repository extends Repository<Cat, Integer> {
    /**
     * 查询方法以get|find|read开头
     * @param catName
     * @return
     */
    //根据catName进行查询:根据catName进行查询
    public Cat findByCatName(String catName);

    /**
     * 如何变形JPHL语句
     * JPQL和HQL语句是类型的
     * @param catName
     * @return
     */
    @Query("from Cat where catName=:cn")
    public Cat findMyCatName(@Param("cn") String catName);
}
