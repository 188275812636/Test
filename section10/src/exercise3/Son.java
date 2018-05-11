package exercise3;

/**
 * 先调用父类构造方法再调用子类构造方法，最后调用成员方法
 */
public class Son extends Father{
    public Son() {
        System.out.println("子类构造方法");
    }
    public static void f1(){
        System.out.println("子类成员方法");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.f1();
    }
}
