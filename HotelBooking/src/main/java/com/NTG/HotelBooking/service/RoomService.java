package com.NTG.HotelBooking.service;


import com.NTG.HotelBooking.controller.RoomController;
import com.NTG.HotelBooking.exception.DuplicateRoomException;
import com.NTG.HotelBooking.exception.ResourceNotFoundException;
import com.NTG.HotelBooking.model.Room;
import com.NTG.HotelBooking.repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepo roomRepo;


    //add new room
    public Room addRoom(Room room) {
        boolean exists = roomRepo.existsByTypeAndPrice(room.getType(), room.getPrice());

        if (exists) {
            throw new DuplicateRoomException("Room with the same type and price already exists");
        }

        return roomRepo.save(room);
    }


    //get all rooms
    public List<Room> getAllRooms(){
        return roomRepo.findAll();
    }

    //get room by ID
    public Room getRoomById(int id ){
        return roomRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));
    }

    //update room by ID
    public Room updateRoomById(int id ,Room room ){
        Room updatedroom = roomRepo.findById(id).
                                         orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));

        updatedroom.setType(room.getType());
        updatedroom.setSize(room.getSize());
        updatedroom.setPrice(room.getPrice());
        updatedroom.setAvailable(room.isAvailable());

        return roomRepo.save(updatedroom);
    }

    //delete room by ID
    public String deleteRoomById(int id) {
        Room deletedRoom = roomRepo.findById(id)
                                      .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));
        roomRepo.delete(deletedRoom);
        return "Room with ID " + id + " has been successfully deleted.";
    }

    //search in rooms
    public List<Room> searchRoom(String type, BigDecimal price, Integer size) {
        // Pass `size` directly to the repository, which will handle the filtering logic
        return roomRepo.searchRooms(type, price, size);
    }



}
