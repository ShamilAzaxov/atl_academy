package com.company;

public class Car extends Vehicle{
   private Company company;
    private String model;
    private String vehicleNum;
    private Fuel fuelType;


    public Car(Company company, String model, String vehicleNum, Fuel fuelType) {
        this.company = company;
        this.model = model;
        this.vehicleNum = vehicleNum;
        this.fuelType = fuelType;
    }

    public Car(){

    }
    @Override
    public void go() {
        System.out.println("Car went");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }

    @Override
    public Integer numOfVehicles() {
        return 4;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company=" + company +
                ", model='" + model + '\'' +
                ", vehicleNum='" + vehicleNum + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }
}
