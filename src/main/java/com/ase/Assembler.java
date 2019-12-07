package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class Assembler extends Employee{

    Assembler(){
        //Assign the authorization level
        this.authorityLevel = ASSEMBLER;
    }

    protected void write(String message) {
        System.out.println(message + "all parts have been put together");
    }
}
