package com.kodilla.good.patterns.food2Door;

public class Supplier {
    int id;
    String name;
    String ownerName;
    String ownerSurname;
    String address;

    public Supplier(int id, String name, String ownerName, String ownerSurname, String address) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public String getAddress() {
        return address;
    }
}
