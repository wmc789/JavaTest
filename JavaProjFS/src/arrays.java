

public class arrays {
    public static void main(String[] args) {

        String[] cars = {"VW", "BMW", "Mercedes",};

            cars[0] = "Opel";
            System.out.println(cars[1]);
            System.out.println();

        String[] planes = new String[4];

            planes[0] = "Messerschmitt";
            planes[1] = "Spitfire";
            planes[2] = "Focke-Wulf";
            planes[3] = "Mustang";

        for(int i=0; i<planes.length; i++){
            System.out.println(planes[i]);
        }
    }
}
