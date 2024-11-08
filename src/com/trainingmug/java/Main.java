package com.trainingmug.java;

public class Main {
    public static void main(String[] args) {
        // Creating Employee Objects
        // instances (synonym for object)
        // Two Types of data
        // Primitives (byte, short, int, long, float, double, char, boolean)
        // Object

        // byte age= 100;

        new Employee(); //create a new Employee object
        new Employee(); //create another new Employee object

        Employee emp; // emp is a reference variable only, no object will be created here
        byte age;
        age = 100;

        emp = new Employee(); // A new Employee object will be created and will be referred by emp

        Employee emp1; // reference variable
        emp1 = new Employee();

        // Stack , Heap
        // All objects will be stored in heap memory

        // All local variables are stored in stack

        System.out.println("--------- Default Values ---------");
        //Access instance variables
        emp.employeeProfile();

        // initialize Employee objects data

        emp.empId = 11111;
        emp.name = "John Doe";
        emp.department = "development";
        emp.basicSalary = 345345.34f;
        emp.ta = 343.34f;
        emp.da = 565.34f;
        emp.hra = 1234.56f;
        emp.gender = 'M';
        emp.joiningYear = 2020;
        emp.isRegular = true;

        System.out.println("----------- After Initialization ------------");

        emp.employeeProfile();
        // System.out.println(emp.incrementBasicSalary(12.5f));
        emp.incrementBasicSalary(12.5f);
        System.out.println("Updated Employee 1 Basic Salary : " + emp.basicSalary);

        /*
        float totalSalary = emp.calculateTotalSalary();
        System.out.println("Employee 1 total Salary : " + totalSalary);
         */
        System.out.println(emp.name + "'s Total Salary is : " + emp.calculateTotalSalary());
        System.out.println(emp.name + "'s Total Salary after increment: " + emp.calculateTotalSalaryAfterIncrement(12.5f)); // 12.5 Argument ( the real data )
        //

        emp1.empId = 22222;
        emp1.name = "emp2";
        emp1.department = "production";
        emp1.basicSalary = 445345.34f;
        emp1.ta = 443.34f;
        emp1.da = 665.34f;
        emp1.hra = 2234.56f;
        emp1.gender = 'F';
        emp1.joiningYear = 2019;
        emp1.isRegular = false;

        //

        System.out.println("--------------- Employee 2 -------------------");

        emp1.employeeProfile();

        // emp1.incrementBasicSalary(15.5f);

        // System.out.println("Updated Employee 2 Basic Salary : " + emp1.basicSalary);
        System.out.println(emp1.name + "'s Total Salary is : " + emp1.calculateTotalSalary());
        System.out.println(emp1.name + "'s Total Salary after increment: " + emp1.calculateTotalSalaryAfterIncrement(15.0f));


        Employee emp3;
        emp3 = new Employee();
        emp3.name = "emp3";
        System.out.println("Employee 3 Name : " + emp3.name);

        System.out.println(new Employee().name);

        /*
        int add(int x, int y){
            return x + y;
        }

        add(10,20);

         */
    }
}
