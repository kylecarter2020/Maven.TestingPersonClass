package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String height;
    private String gender;
    private String phoneNumber;
    private String race;
    private int weight;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age =age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(Integer feet, Integer inches) {
        this.height = feet.toString() + " Feet " + inches.toString() + " Inches";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRace() {
        return this.race;
    }

    public Integer getWeight() {
        return this.weight;
    }
}
