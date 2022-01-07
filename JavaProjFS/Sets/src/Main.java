import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();  //gibts auch ein String set ??
        t.add(5);
        t.add(2);
        t.add(57);
        t.add(8);
        t.add(-25);
        t.remove(2);
        //t.clear();  schmeißt alles raus !

        boolean x = t.contains(-25); //befindet sich gesuchter wert im set ?

        int g = t.size();

        System.out.println(x);
        System.out.println(g);

    }
}
