import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Map m = new HashMap();
        String str = "Hallo mein Name ist Bob und ich komme aus Hamburg";

        for(char x:str.toCharArray()) {
            if (m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else {
                m.put(x, 1);
            }
        }
        //m.remove('');  hier würden die Leerzeichen ausgenommen werden
        System.out.println(m);*/

        int[] x = {-12,3,1,7,6,8,9,11,12,0,2};

        Arrays.sort(x, 0, 11);   //sortiere bitte von ___ bis ___ durch !!!

        for(int i:x) {
            System.out.print(i + ",");
        }
    }
}
