package com.taskthree;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1996);
        Car car2 = new Car(2009, 160.33256);
        Car car3 = new Car(2010, 170.5488765, 2000);
        Car car4 = new Car(2012, 190.9993934, 1800, "green");
        System.out.println("Перший конструктор. Рік: " + car.getYear() + " Швидкість: " + car.getSpeed() + " Вага: "
                + car.getWeight() + "кг Колір: " + car.getColor());
        System.out.println("Другий конструктор. Рік: " + car1.getYear() + " Швидкість: " + car1.getSpeed() + " Вага: "
                + car1.getWeight() + "кг Колір: " + car1.getColor());
        System.out.println("Третій конструктор. Рік: " + car2.getYear() + " Швидкість: " + car2.getSpeed() + " Вага: "
                + car2.getWeight() + "кг Колір: " + car2.getColor());
        System.out.println("Четвертий конструктор. Рік: " + car3.getYear() + " Швидкість: " + car3.getSpeed() + " Вага: "
                + car3.getWeight() + "кг Колір: " + car3.getColor());
        System.out.println("П'ятий конструктор. Рік: " + car4.getYear() + " Швидкість: " + car4.getSpeed() + " Вага: "
                + car4.getWeight() + "кг Колір: " + car4.getColor());
    }
}
