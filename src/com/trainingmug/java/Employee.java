package com.trainingmug.java;

public class Employee {
    //class is a template which describes state and behavior of its object

    // state (data)
    //empId, name, department, basicSalary, taxes, allowances, gender, joiningYear etc...
    // instance variables (each instance will have its own copy of these variables)
    // by-default instance variables are initialized to the default values
    /*
        byte, short, int, long -> 8
        float, double -> 8.0

        char -> null or empty character with unicode value 0
        boolean -> false

        Object -> null

     */

    int empId;

    String name;

    String department;


    float basicSalary;

    float ta;

    float hra;

    float da;

    char gender;

    int joiningYear;

    boolean isRegular;

    //behavior
    //action taken by this object (methods)
    //Syntax of the method declaration
    /*
    access_modifier return_type methodName (parameters) {
    //body (business logic)
    }
     */

    // Calling method
    // methodName(data);

    /*
    1. No Return Type No Parameters
     */

    // Method Declaration

    void employeeProfile () { //instance method
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Department : " + department);
        System.out.println("Employee Basic Salary : " + basicSalary);
        System.out.println("Employee Travelling Allowances : " + ta);
        System.out.println("Employee HRA : " + hra);
        System.out.println("Employee Direct Allowances : " + da);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Joining Year : " + joiningYear);
        System.out.println("Is Regular Employee ?" + isRegular);
    }

    // 2. No Return Type - Parameter

    void incrementBasicSalary(float percentage){
        // increment basic  salary
        basicSalary = basicSalary + (basicSalary * percentage / 100);
    }

    // 3. With Return Type - No Parameters
    // The return type could be  a primitive or an Object

    float calculateTotalSalary(){
        /*
        float totalSalary = basicSalary + hra + ta + da;
        return totalSalary;
         */
        return basicSalary + hra + ta + da;
    }

    // 4. With Return Type - With Parameters

    float calculateTotalSalaryAfterIncrement(float incrementPercentage){ // calling method
        float totalSalary = calculateTotalSalary();  // called method
        totalSalary = totalSalary + (totalSalary * incrementPercentage / 100);
        return totalSalary;
    }
}
