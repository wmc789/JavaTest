import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gebe dein Alter an: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int alter = Integer.parseInt(s);

        if(alter >= 18){
            System.out.println("Dein Lieblingsessen: "); //ab hier -> nested Statement ;)
            String Essen = input.nextLine();
            if (Essen.equals("Steak")){
                System.out.println("meins auch :)!");
            }
            else {
                System.out.println("Mhh nicht so mein Ding!");
            }
        }
        else if( alter >= 13){
            System.out.println("Du bist ein Teenager!");
        }
        else {
            System.out.println("Du bist weder erwachsen noch ein Teenager!");
        }

    }
}
