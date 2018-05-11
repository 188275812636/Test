package section3_2;

public class Compare {
    static int age = 18;//成员变量
    public static void f() {
        String name = "mary";//局部变量
    }
    public static void main(String[] args) {
        System.out.print(age);
        //System.out.print(name);//无法访问到局部变量
    }
}
