package com.NTG.HotelBooking.service;

import com.NTG.HotelBooking.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int theId);

    User save(User theUser);

    void deleteById(int theId);
   //   List<User> findByFirstName(String firstName);
}
