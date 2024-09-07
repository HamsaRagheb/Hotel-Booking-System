package com.NTG.HotelBooking.repository;

import com.NTG.HotelBooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
  //  @Query("SELECT u FROM User u WHERE u.firstName = :keyword OR u.email = :keyword")
//    List<User> findByFirstNameOrEmail(@Param("keyword") String keyword);
  List<User> findByFirstName(String firstName);

}
