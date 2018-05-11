package exercise3;

public class BooleanTest {
    public static void main(String args[]) {
        Boolean b = new Boolean("test");
        String str = b.toString();
        System.out.println(str);//false
        b = new Boolean("true");
        str = b.toString();
        System.out.println(str);//true
    }
}
