public class methods {

    public static void main(String[] args) {
        //method = Codeblock der ausgeführt wird, wenn aufgerufen !
        String user = "Benutzer";
        int x = 7;
        int y = 4;

        int z = add(x,y);

        //hello();
        hello(user);
        System.out.println(z);
    }

    static void hello(String user){
        //System.out.println("Hello ");
        System.out.println("Hello "+user);
    }

    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}

