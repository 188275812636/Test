package exercise3;

public class Computer {
    public static int getMaxComm(int m , int n) throws MyException{
        if( m <= 0 ||n<=0){
            throw new MyException("参数错误");
        }
        if(m < n){
            int temp = 0;
            temp = m;
            m = n;
            n = temp;
        }
        int r = m % n;
        while(r!=0){
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
    public static void main(String[] args) {
        try {
            int m = 15 , n= 18;
            System.out.println("最大共约数是："+getMaxComm(m,n));
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
