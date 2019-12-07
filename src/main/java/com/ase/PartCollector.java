package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class PartCollector extends Employee{

    PartCollector(){
        //Assign the authorization level
        this.authorityLevel = PART_COLLECTOR;
    }

    protected void write(String message) {
        System.out.println(message + "all parts have been gathered");
    }
}
