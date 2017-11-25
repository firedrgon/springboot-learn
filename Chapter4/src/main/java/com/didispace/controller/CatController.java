package com.didispace.controller;

import com.didispace.domain.Cat;
import com.didispace.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Yuanping on 2017/11/22.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    //保存
    @RequestMapping("/save")
    public String save() {
        Cat cat = new Cat();
        cat.setCatName("cat111");
        cat.setCatAge(23);
        catService.save(cat);
        return "save ok";
    }

    @RequestMapping("/delete")
    public String delete() {
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName) {
        Cat cat = catService.findByCatName(catName);
        return cat;
    }

    @RequestMapping("/findMyCatName")
    public Cat findMyCatName(String catName) throws Exception {
        Cat cat = catService.findMyCatName(catName);
        if (cat == null) {
            throw new Exception("hello");
        }
        return cat;
    }

    //selectByCatName
    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName) {

        Cat cat = catService.selectByCatName(catName);
        return cat;
    }
}







