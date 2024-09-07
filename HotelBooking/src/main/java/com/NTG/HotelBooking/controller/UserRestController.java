package com.NTG.HotelBooking.controller;

import com.NTG.HotelBooking.model.User;
import com.NTG.HotelBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService theUserService) {
        userService = theUserService;
    }

    // expose "/users" and return a list of users
    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    // add mapping for GET /users/{userId}
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable int userId) {

        User theUser = userService.findById(userId);

        if (theUser == null) {
            throw new RuntimeException("User id not found - " + userId);
        }

        return theUser;
    }
    /*
    @GetMapping("/users/{userId}")
    public User getUserByfirstName(@PathVariable String userId) {

        User theUser = userService.findById(userId);

        if (theUser == null) {
            throw new RuntimeException("User id not found - " + userId);
        }

        return theUser;
    }
*/
    // add mapping for POST /users - add new user
    @PostMapping("/users")
    public User addUser(@RequestBody User theUser) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theUser.setId(0);

        User dbUser = userService.save(theUser);

        return dbUser;
    }

    // add mapping for PUT /users - update existing user
    @PutMapping("/users")
    public User updateUser(@RequestBody User theUser) {


        User dbUser = userService.save(theUser);
        return dbUser;
    }

    // add mapping for DELETE /users/{userId} - delete user
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable int userId) {

        User tempUser = userService.findById(userId);

        // throw exception if null
        if (tempUser == null) {
            throw new RuntimeException("User id not found - " + userId);
        }

        userService.deleteById(userId);

        return "Deleted user id - " + userId;
    }
    // add mapping for GET /search - search users by first name or email
    // Add a new method to search by first name
    /*
    @GetMapping("/search")
    public List<User> getUsersByFirstName(@RequestParam String firstName) {
        return userService.findByFirstName(firstName);
    }
*/
}
