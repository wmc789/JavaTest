import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

    try{

        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x/y;

        System.out.println("result: "+ z);
    }
        catch(ArithmeticException e){
        System.out.println("Dont divide by Zero! Moron!");
        }
        catch(InputMismatchException e){
            System.out.println("Jeeez, just enter a number!");
        }
        catch(Exception e){
            System.out.println("Something went wrong !");//fängt alles quasi auf aber direkte catches werden idR genutzt !!
        }
        finally {
            scanner.close();
        }
    }
}
