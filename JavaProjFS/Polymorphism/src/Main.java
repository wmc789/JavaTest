public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, boat, bicycle};

        for(Vehicle x : racers){
            x.go();
        }
    }
}
