package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class Welder extends Employee{

    Welder(){
        //Assign the authorization level
        this.authorityLevel = WELDER;
    }

    protected void write(String message) {
        System.out.println(message + "all parts have been welded together");
    }
}
