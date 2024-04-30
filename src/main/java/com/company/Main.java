package com.company;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(Company.MERCEDES, "GR5", "4",Fuel.DIESEL);
        Vehicle car3 = new Car();
        Vehicle car4 = new Car(Company.BMW, "G5", "4",Fuel.GASOLINE);
        car3.go();
        car1.stop();
        System.out.println(car1.numOfVehicles());



        if (car3 instanceof Car)
            System.out.println(car1);
        else
            throw new CustomException("Asdjsdksdc");

    }
}