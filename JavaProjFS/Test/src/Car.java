
public class Car {

    private String model;
    private int age;

    public Car(String model, int age){
        this.model = model;
        this.age = age;
    }

    public void data() {

        System.out.println("Fahrzeug " + this.model + " ist " + this.age + " Jahre alt");
    }

    public int getAge(){

        return this.age;
    }
}
