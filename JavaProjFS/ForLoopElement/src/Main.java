import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,3,1,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        int count = 0;

        /*for (int element:arr){
            System.out.println(element + " " + count);
            count++;
        }*/

        for (int i =0; i < names.length; i++){
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n:names){
            System.out.println(n);
            if (n.equals("exit")) {
                break;
            }
        }
    }
}
