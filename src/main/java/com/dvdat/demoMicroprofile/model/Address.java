package com.dvdat.demoMicroprofile.model;

import javax.json.bind.annotation.JsonbProperty;

public class Address {
    @JsonbProperty(value="first_name")
    private String firstName;

    @JsonbProperty(value = "last_name")
    private String lastName;

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

    @Override
    public String toString() {
        return "Address{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
