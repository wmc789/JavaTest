package com.company;
import java.util.Random;

public class randomValue {
    public static void main(String[] args){

        Random random = new Random(); //implementierung random funktion

        //int x = random.nextInt(10)+2;
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
