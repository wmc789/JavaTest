import java.io.FileWriter;
import java.io.IOException;

public class Main {

        public static void main(String[] args) {

            try{
                FileWriter writer = new FileWriter("javageschrieben.txt");
                writer.write("Roses are red \nViolets are blue \nwe are set \nand so are you!");
                writer.append("\na poem by castle)");
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
}
