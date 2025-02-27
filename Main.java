/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Ecaterina
 */
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

abstract class car
{
   
    Driver driver;
    ArrayList< pass > pasergers;
    String pass[];
    abstract void detail_car();
    
}
class electric extends car
{
     void detail_car()
    {
        System.out.print( " this is our electric car ");
    }
}
 class internalC extends car
 {
          void detail_car()
    {
        System.out.print( " this is an internal combustion car  ");
    }
 }
 class person
{
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void SayHi()
    {
        System.out.print( "Hi i am a person ");
    }
  
}

class Driver extends person
{
   private  int yearA;
   public void setYearA(int yearA)
    {
        this.yearA=yearA;
    }
    public int getYearA()
    {
        return this.yearA;
    }
    
        public void SayHi()
    {
        System.out.print( "Hi i am a driver ");
    }
}

class pass extends person
{
   private int age;
      public void setYearA(int age)
    {
        this.age=age;
    }
    public int getYearA()
    {
        return this.age;
    }
           public void SayHi()
    {
        System.out.print( "Hi i am a passager ");
    }
}

