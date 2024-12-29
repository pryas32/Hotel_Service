package com.lcwd.hotel.impl;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.hibernate.sql.ast.tree.expression.Over;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//decalred as service so that iske bean bana sake
public class HotelServiceImpl implements HotelService {


@Autowired
private HotelRepository HotelRepository;

@Override
    public Hotel create(Hotel hotel){
    return HotelRepository.save(hotel);
    }

 @Override
 public List<Hotel> getAll(){
    return HotelRepository.findAll();
 }

 @Override
    public Hotel get(String id){
    return HotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found !!"));
 }











}

