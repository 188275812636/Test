package exercise2;

public class Father {
    public static void f1(){
        System.out.println("father.f1()");
    }
    public static void f2(){
        System.out.println("father.f2()");
    }
    public static void main(String[] args) {
        Father son = new Son();
        son.f2();//father.f2()
    }
}
