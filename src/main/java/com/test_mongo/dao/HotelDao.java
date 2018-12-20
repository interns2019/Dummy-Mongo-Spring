package com.test_mongo.dao;

import com.test_mongo.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends MongoRepository<Hotel,String> {
}
