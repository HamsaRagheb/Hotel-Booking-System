package com.NTG.HotelBooking.controller;


import com.NTG.HotelBooking.model.Room;
import com.NTG.HotelBooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/")
    public String grade(){
        return "Hotel Booking System ";
    }
    /********************************************************************************************/
    @PostMapping("/addRoom")
    public ResponseEntity<Room> addRoom(@RequestBody Room room){
        Room newRoom = roomService.addRoom(room);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRoom);
    }
    /********************************************************************************************/

    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getAllRooms(){
        List<Room> roomList = roomService.getAllRooms();
        return ResponseEntity.status(HttpStatus.OK).body(roomList);
    }
    /********************************************************************************************/

    @GetMapping("/room/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable int id){
        Room room = roomService.getRoomById(id);
        return ResponseEntity.status(HttpStatus.OK).body(room);
    }
    /********************************************************************************************/

    @PutMapping("/updateRoom/{id}")
    public ResponseEntity<Room> updateRoomById(@PathVariable int id, @RequestBody Room room){
        Room updatedRoom =roomService.updateRoomById(id,room);
        return ResponseEntity.status(HttpStatus.OK).body(updatedRoom);
    }
    /********************************************************************************************/

    @DeleteMapping("/deleteRoom/{id}")
    public ResponseEntity<String> deleteRoomById(@PathVariable int id){
        String message = roomService.deleteRoomById(id);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    /********************************************************************************************/

    @GetMapping("/searchRoom")
    public ResponseEntity<List<Room>> searchRoom(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) BigDecimal price,
            @RequestParam(required = false) Integer size) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(roomService.searchRoom(type, price, size));
    }
    /********************************************************************************************/



}
