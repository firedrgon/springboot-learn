package com.didispace.respository;

import com.didispace.domain.Cat;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Respository是接口，不是class
 * Created by Yuanping on 2017/11/22.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
