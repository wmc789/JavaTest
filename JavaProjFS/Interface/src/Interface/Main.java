package Interface;// package Interface;

import Interface.Rabbit;

public class Main {
    public static void main(String[] arg ){

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}