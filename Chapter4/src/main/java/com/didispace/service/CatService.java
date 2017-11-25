package com.didispace.service;

import com.didispace.dao.CatDao;
import com.didispace.domain.Cat;
import com.didispace.respository.Cat2Repository;
import com.didispace.respository.CatRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Yuanping on 2017/11/22.
 */
@Service
public class CatService {
    @Resource
    private CatRepository catRespository;

    @Resource
    private Cat2Repository cat2Repository;

    @Resource
    private CatDao catDao;

    /**
     * CrudRespository
     * @param cat
     */
    @Transactional(rollbackFor = Exception.class)
    public void save(Cat cat) {
        catRespository.save(cat);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(int id) {
        catRespository.delete(id);
    }

    public Iterable<Cat> getAll() {
        return catRespository.findAll();
    }

    /**
     *
     * @param catName
     * @return
     */
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }

    public Cat findMyCatName(String catName) throws Exception {
        return cat2Repository.findMyCatName(catName);
    }

    public Cat selectByCatName(String catName) {
        return catDao.selectByCatName(catName);
    }
}




















