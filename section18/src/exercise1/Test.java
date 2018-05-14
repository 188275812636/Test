package exercise1;

public class Test extends Thread{
    int i;
    public void run() {
            /*
            线程Thread1和Thread1执行加操作
            Thread3和Thread4执行减操作
             */
            if(Thread.currentThread().getName().equals("Thread1") || Thread.currentThread().getName().equals("Thread2")){
                i++;
                System.out.println("数值："+i);
            }else{
                i--;
                System.out.println("数值："+i);
            }
    }
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        new Thread(t, "Thread1").start();
        Thread.sleep(1000);
        new Thread(t, "Thread2").start();
        Thread.sleep(1000);
        new Thread(t, "Thread3").start();
        Thread.sleep(1000);
        new Thread(t, "Thread4").start();
        Thread.sleep(1000);
        System.out.println(t.i);
    }
}
