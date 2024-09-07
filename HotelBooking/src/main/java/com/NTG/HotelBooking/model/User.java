package com.NTG.HotelBooking.model;

import jakarta.persistence.*;
@Entity(name = "user")
public class User {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    @Column(name="res_room")
    private int resRoom;
    @Column(name="wallet")
    private Integer wallet=0;

    // define constructors
    public User() {

    }

    public User(int id, String firstName, String lastName, String email, int resRoom) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.resRoom = resRoom;
    }

    // define getter/setter


    public Integer getWallet() {
        return wallet != null ? wallet : 0;  // Set default value as 0 when wallet is null
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }

    public int getResRoom() {
        return resRoom;
    }

    public void setResRoom(int resRoom) {
        this.resRoom = resRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define toString
    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
