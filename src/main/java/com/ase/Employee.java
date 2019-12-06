package com.ase;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public abstract class Employee {

    public static int PART_COLLECTOR = 4;
    public static int ASSEMBLER = 3;
    public static int WELDER = 2;
    public static int PAINTER = 1;

    protected int authorityLevel;

    protected Employee nextEmployee;

    public void setNextEmployee(Employee employee){
        this.nextEmployee = employee;
    }

    public void doWork(int authorityLevel, String message){
        if(this.authorityLevel <= authorityLevel){
            write(message);
        }
        if(nextEmployee != null){
            nextEmployee.doWork(authorityLevel, message);
        }
    }

    abstract protected void write(String message);

}
