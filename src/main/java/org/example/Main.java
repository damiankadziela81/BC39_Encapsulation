package org.example;

public class Main {
    public static void main(String[] args) {

        // Encapsulation = 	attributes of a class will be hidden or private,
        //					Can be accessed only through methods (getters & setters)
        //					You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Porshe","911",1986);

        System.out.println(car.getMake());
        System.out.println(car.giveModel());
        System.out.println(car.getYear());

        car.setYear(2000);

        System.out.println(car.getYear());

    }
}