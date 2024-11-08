package com.trainingmug.java;

public class RecursiveTest {
    void m1(){
        System.out.println("m1 method"); m1();
    }

    // Find Factorial of a given number

    int factorialValue(int no){
        //5
        //5*4*3*2*1 = 120
        int factorialValue = 1;
        while(no != 0){
            factorialValue *= no;
            no--;
        }
        return factorialValue;
    }

    int factorialValueWithRecursive(int no){
        if(no == 1)
            return 1;
        else
            return no * factorialValueWithRecursive(no - 1);
    }

    public static void main(String[] args) {
        RecursiveTest rt = new RecursiveTest();
        // rt.m1();
        int no = 5;
        System.out.println("Factorial Value of " + no + " is : " + rt.factorialValue(no));
        System.out.println("Factorial Value of " + no + " is : " + rt.factorialValueWithRecursive(no));
    }
}
