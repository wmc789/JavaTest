
public class Objects {
    public static void main(String[] args) {

        Sumting("Yoyo whats up", 2); //arguments

        System.out.println(add4(5));

        System.out.println(str("kaufen"));

    }
    public static void Sumting(String str, int x){ //hier steht parameter drin !
        for(int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add4(int x) {
        return x + 4;
    }

    public static String str(String y) {
        return y + "?";
    }

}
