package exercise1;

public class Get extends Limit{
    static Limit l = new Limit();
    public static void main(String[] args) {
        l.setA(5);
        System.out.println(l.getA());
    }
}
