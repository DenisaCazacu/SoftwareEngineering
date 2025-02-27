/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1;

/**
 *
 * @author Ecaterina, Denisa
 */

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        electric electricCar1 = new electric();
        electric electricCar2 = new electric();
        passenger passenger1 = new passenger();
        passenger.setName("Denisa");
        passenger.setAge(20);
        electricCar1.addPassenger(passenger1);
        electricCar2.addPassenger("Cati", 20);
        electricCar1.detail_car();
    }

}

abstract class car
{

    Driver driver;
    ArrayList<passenger> passengers;
    abstract void detail_car();
}
class electric extends car
{
    void detail_car()
    {
        System.out.print( "This is an electric car.");
        System.out.println();
    }
    void addPassenger (passenger p){
        passengers.add(p);
    }
    void addPassenger (String name, int age){
        passenger p = new passenger();
        p.setName(name);
        p.setAge(age);
        passengers.add(p);
    }
    void addDriver (String name, int years){
        driver = new Driver();
        driver.setName(name);
        driver.setYearsExp(years);
    }
}
class internalC extends car
{
    void detail_car()
    {
        System.out.print( "This is an internal combustion car.");
        this.driver.displayDriver();
        System.out.println("Passengers: ");
        for(passenger p : passengers){
            p.displayPassenger();
        }
    }
}
class person
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void SayHi()
    {
        System.out.print( "Hi, I am a person!");
    }

}

class Driver extends person
{
    private  int yearsExp;
    public void setYearsExp(int yearExp)
    {
        this.yearsExp=yearsExp;
    }
    public int getYearsExp()
    {
        return this.yearsExp;
    }

    public void SayHi()
    {
        System.out.print( "Hi, I am a driver!");
    }
    void displayDriver(){
        System.out.println("Driver Name: " + this.getName());
        System.out.println("Driver's Experience:" + yearsExp);
    }
}

class passenger extends person
{
    private int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void SayHi()
    {
        System.out.print( "Hi i am a passenger! ");
    }
    public void displayPassenger(){
        System.out.println("Passenger Name: " + this.getName());
        System.out.println("Passenger Age: " + age);
    }
}
