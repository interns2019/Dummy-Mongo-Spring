package com.test_mongo.controller;

import com.test_mongo.dao.HotelDao;
import com.test_mongo.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelDao hotelDao;

    @GetMapping("/all")
    public List<Hotel> getAll(){
        List<Hotel> hotels = hotelDao.findAll();
        return hotels;
    }
}
