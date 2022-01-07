import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileReader;

public class Main {

        public static void main(String[] args) {

                File file = new File("the message.txt");

                if(file.exists()){
                        System.out.println("That File exists ! =) ");
                        System.out.println(file.getPath());
                        System.out.println(file.getAbsolutePath());
                        System.out.println(file.isFile());
                        file.delete(); //hier Datei gelöscht !!!
                }
                else {
                        System.out.println("That File doesn't exists ! =( ");
                }

        }
}
