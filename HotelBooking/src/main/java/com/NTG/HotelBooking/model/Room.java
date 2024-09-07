package com.NTG.HotelBooking.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Room", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type", "price"})
})
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int size;
    private BigDecimal price;
    private boolean available;

    public Room() {
        super();
    }

    public Room(int id, String type, int size, BigDecimal price, boolean available) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
