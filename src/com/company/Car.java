package com.company;

public class Car implements Comparable<Car> //implement the Comparable interface so that it sorts Car class objects by year of manufacture
{
    private String name;
    private String model;
    private int year;

    public Car(String model, String name, int year) {
        this.model = model;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return model+" "+year; //the way of displaying the info
    }

    @Override
    public int compareTo(Car car) {
        return year-car.year; //0 //changing the order of sorting
    }
}
