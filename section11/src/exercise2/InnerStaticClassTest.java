package exercise2;

public class InnerStaticClassTest {
    static class InnerStaticClass{
       public static void f(){
            System.out.println("静态内部类");
        }
    }
    public static void main(String[] args) {
        InnerStaticClassTest.InnerStaticClass inner = new InnerStaticClass();
        inner.f();
    }
}
