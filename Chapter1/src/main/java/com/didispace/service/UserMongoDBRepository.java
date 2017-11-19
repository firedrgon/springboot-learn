package com.didispace.service;

import com.didispace.domain.User2;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yuanping on 2017/9/17.
 */
public interface UserMongoDBRepository extends MongoRepository<User2, Long> {
    User2 findByUsername(String username);
}
