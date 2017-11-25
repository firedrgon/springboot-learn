package com.didispace.dao;

import com.didispace.domain.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Yuanping on 2017/11/24.
 */
@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * jdbcTemplate查询
     * @param catName
     * @return
     */
    public Cat selectByCatName(String catName) {
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);

        Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
        return cat;
    }

}
