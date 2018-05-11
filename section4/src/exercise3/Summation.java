package exercise3;

public class Summation {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;
        while (i<=20){//20次循环
            int j = 1;
            int f = 1;
            while(j<=i){
                f = f*j;//计算阶乘
                j=j+1;
            }
            i=i+1;
            sum = sum + 1.0/f;
        }
        System.out.println(sum);
    }


   /*
   public static void main(String args[])
   {
       double sum = 0,a = 1;
       int i = 1;
       while(i <= 20)
       {
           sum = sum+a;
           i = i+1;
           a = a*(1.0/i);
       }
       System.out.println(sum);
   }
   */
}
