import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //sc.next();  //input vom Scanner mit Namen "cs"

        String str = "YOYOYOOO";
        str.length(); //Abfrage Länge des Strings "str"

        singsing();  //Hier rufe ich die methode/funktion "singsing" auf

        yodel("joooodelahiiiii", 5);  //hier argument geben damit methode "yodel" auch wass zurückgeben kann

        System.out.println(add4(10));

        System.out.println((ausgabe("verkaufen")));

    }

    public static void singsing() {
        System.out.println("LaaLaaaLaa");
    }

    public static void yodel(String str, int x) { //methode gibt hier einen String zurück
        for(int i = 0; i < x; i++) { //sooft bitte durchlaufen !
            System.out.println(str);
        }
    }

    public static int add4(int y){  //int übergeben
        return y +4;
    }

    public static String ausgabe(String z){ //string übergeben
        return z + "?!";
    }

}
