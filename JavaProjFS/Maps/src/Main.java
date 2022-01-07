import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("bob", 4);
        m.put(99, 66);
        m.put(12, "Zahl");

        m.containsValue("Zahl");
        m.containsKey("bob");

        m.isEmpty(); //ist die map leer ?

        //System.out.println(m.get("bob")); //Schlüssel "bob" -> zum Wert "6"
        System.out.println(m.get("bob"));
        System.out.println(m.values());
    }
}
