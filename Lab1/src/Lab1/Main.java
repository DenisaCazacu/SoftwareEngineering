package Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        electric electricCar1 = new electric();
        electric electricCar2 = new electric();
        passenger passenger1 = new passenger();
        passenger1.setName("Denisa");
        passenger1.setAge(20);
        electricCar1.addPassenger(passenger1);
        electricCar2.addPassenger("Cati", 20);
        electricCar1.detail_car();
    }
}

abstract class car {
    Driver driver;
    ArrayList<passenger> passengers = new ArrayList<>();
    abstract void detail_car();
}

class electric extends car {
    void detail_car() {
        System.out.println("This is an electric car.");
        if (driver != null) {
            driver.displayDriver();
        }
        System.out.println("Passengers: ");
        for (passenger p : passengers) {
            p.displayPassenger();
        }
    }

    void addPassenger(passenger p) {
        passengers.add(p);
    }

    void addPassenger(String name, int age) {
        passenger p = new passenger();
        p.setName(name);
        p.setAge(age);
        passengers.add(p);
    }

    void addDriver(String name, int years) {
        driver = new Driver();
        driver.setName(name);
        driver.setYearsExp(years);
    }
}

class internalC extends car {
    void detail_car() {
        System.out.println("This is an internal combustion car.");
        if (driver != null) {
            driver.displayDriver();
        } else {
            System.out.println("No driver assigned.");
        }
        System.out.println("Passengers: ");
        for (passenger p : passengers) {
            p.displayPassenger();
        }
    }
}

class person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void SayHi() {
        System.out.println("Hi, I am a person!");
    }
}

class Driver extends person {
    private int yearsExp;

    public void setYearsExp(int yearExp) {
        this.yearsExp = yearExp;
    }

    public int getYearsExp() {
        return this.yearsExp;
    }

    public void SayHi() {
        System.out.println("Hi, I am a driver!");
    }

    void displayDriver() {
        System.out.println("Driver Name: " + this.getName());
        System.out.println("Driver's Experience: " + yearsExp);
    }
}

class passenger extends person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void SayHi() {
        System.out.println("Hi, I am a passenger!");
    }

    public void displayPassenger() {
        System.out.println("Passenger Name: " + this.getName());
        System.out.println("Passenger Age: " + age);
    }
}
