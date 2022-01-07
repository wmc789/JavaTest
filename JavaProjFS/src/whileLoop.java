import java.util.Scanner;


public class whileLoop {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String name = "";

            while(name.isBlank()){
                System.out.println("Name eingeben: ");
                name = scanner.nextLine();
            }

            System.out.println("Hallo "+name);

        }
}
