package com.taskthree;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 10.11.21
 */

public class Car {
    private final int year;
    private final double speed;
    private final int weight;
    private final String color;

    /*
    Конструкторы
    */
    public Car() {
        this.year = 2000;
        this.speed = 185.0233224225;
        this.weight = 2500;
        this.color = "black";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 200.632232234;
        this.weight = 1700;
        this.color = "red";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1900;
        this.color = "purple";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "orange";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    /*
    Геттеры
    */
    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
