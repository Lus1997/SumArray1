package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array={15,30,50,100,7,26};
        int sum=0;
        int i=0;
        do {
            sum+=array[i];
            i++;
        } while(i< array.length);
        System.out.println("Gumar " + sum);
    }
    }

