package com.example.tablerecycleview.Module;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String phone;
    private String country;
    private int image;
    private String dob;
    private String email;
    private String gender;
    public User(String name, String dob, String email, String gender, String phone, String country, int image) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.country = country;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public int getImage() {
        return image;
    }


}
