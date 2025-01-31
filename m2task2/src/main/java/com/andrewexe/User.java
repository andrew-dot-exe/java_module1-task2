package com.andrewexe;

public class User {

    public User(int id, String firstName, String lastName, int age, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    private int id;

    public int getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public String toString()
    {
        return this.firstName + " "+ this.lastName;
    }
}