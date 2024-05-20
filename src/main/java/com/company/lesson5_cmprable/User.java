package com.company.lesson5_cmprable;

import java.util.Comparator;

public class User implements Comparator<User> /* Comparable<User> */ {
    private long id;
    private String name;
    private String surname;
    private int age;

    public User(long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User() {
    }

    @Override
    public int compare(User u1, User u2){
        return Integer.compare(u1.getAge(), u2.getAge());
    }

    /*
    @Override
    public int compareTo(User u) {
        return Integer.compare(this.age, u.age);
    }
     */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}