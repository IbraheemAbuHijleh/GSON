package com.example.josnexample;

public class Book {
    private String name;
    private int avible;

    public Book() {

    }

    public Book(String name,int avible) {
        this.name=name;
        this.avible = avible;
    }

    public String getName() {

        return name;
    }

    public int getAvible() {
        return avible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvible(int avible) {
        this.avible = avible;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", avible=" + avible +
                '}';
    }
}
