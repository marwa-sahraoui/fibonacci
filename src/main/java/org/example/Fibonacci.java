package org.example;

public class Fibonacci {
    public int result(int number) {

        if(number <2){
            return number;
        } else{
            return result (number-1) + result(number -2);
        }


    }
}
