package com.company;
import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        //int age;
        Scanner AgeRequest = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = AgeRequest.nextInt();


        if(age>=18) {
            System.out.println("you are "+age+" years old, so you re an adult !");
        }
        else {
            System.out.println("you re an minor!");
        }


    }
}