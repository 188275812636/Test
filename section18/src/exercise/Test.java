package exercise;

public class Test extends Thread{
    String str="Hello";
    public static void main(String[] args) {
        Test test = new Test();
        Thread t= new Thread(test);
        t.start();
    }
    /*
    重写run方法
     */
    public void run() {
        while (true) {
            System.out.println(str);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
