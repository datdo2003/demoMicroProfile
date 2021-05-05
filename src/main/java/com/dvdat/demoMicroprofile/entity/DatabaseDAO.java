package com.dvdat.demoMicroprofile.entity;

public class DatabaseDAO {
    public String save(String fileName) {
        System.out.println("Saved in database");
        return fileName;
    }
}
