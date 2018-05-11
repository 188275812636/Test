package exercise1;

public class Return_int {
    public static void main(String[] args) {
        Integer integer = new Integer(15);
        System.out.println(return_int(integer));
    }
    public static int return_int(Integer i){
        return i.intValue();
    }
}
