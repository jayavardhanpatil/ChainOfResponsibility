package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class Painter extends Employee{

    Painter(){
        //Assign the authorization level
        this.authorityLevel = PAINTER;
    }

    protected void write(String message) {
        System.out.println(message + "car complete");
    }
}
