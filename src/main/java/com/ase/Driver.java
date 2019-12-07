package com.ase;

import javax.xml.transform.Source;

/**
 * Created by jayavardhanpatil on 12/6/19
 */
public class Driver {

    public static void main(String[] args) {

        //Initialize all the EMployee classes
        Employee partCollector = new PartCollector();
        Employee assembler = new Assembler();
        Employee welder = new Welder();
        Employee painter = new Painter();

        //Create chain of responsibility (arrange the work flow)
        partCollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);

        //Test - to build a car start from the beginning
        partCollector.doWork(Employee.PART_COLLECTOR, "Build Car -> ");

        System.out.println("\nSecond test");
        //test 2 - If Car is already welded then just Painting is pending
        partCollector.doWork(Employee.PAINTER, "Build Car -> ");
    }

}
