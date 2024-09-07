package com.NTG.HotelBooking.repository;

import com.NTG.HotelBooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RoomRepo extends JpaRepository<Room,Integer> {

    boolean existsByTypeAndPrice(String type, BigDecimal price);

    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE Room AUTO_INCREMENT = 1", nativeQuery = true)
    void resetAutoIncrement();


    @Query("SELECT r FROM Room r WHERE " +
            "(:type IS NULL OR r.type = :type) AND " +
            "(:price IS NULL OR r.price <= :price) AND " +
            "(:size IS NULL OR r.size >= :size) AND " +
            "r.available = true")
    List<Room> searchRooms(@Param("type") String type,
                           @Param("price") BigDecimal price,
                           @Param("size") Integer size);




}


