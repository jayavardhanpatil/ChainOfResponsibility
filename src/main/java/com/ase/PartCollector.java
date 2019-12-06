package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class PartCollector extends Employee{

    PartCollector(int authorizationLevel){
        this.authorityLevel = authorizationLevel;
    }

    protected void write(String message) {
        System.out.println("");
    }
}
