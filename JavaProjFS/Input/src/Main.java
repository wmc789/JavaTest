import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geben Sie etwas ein: ");
        Scanner input = new Scanner(System.in);
        String scanned = input.nextLine();  //wenn nur ".next()" gibts nur ein Wort raus !!
        //String[] words = new String[2];


        System.out.println("Ihre Eingabe war:" +scanned); //gibt nur ein Wort aus ! wie gehen mehrere ?!
    }
}
