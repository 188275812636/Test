package exercise1;

public class Sum {
    public static void main(String[] args) {
        System.out.println("和："+sum());
    }
    public static int sum() {
        int sum = 0;
        int i = 0;
        while (true) {
            int t =  2 +  (int)Math.random() * (30);
            if (t % 2 == 0) {//取偶数
                System.out.println("偶数:" + t);
                sum += t;
                i++;
            }
            if (i == 6) {// 获取六个偶数
                break;
            }
        }
        return sum;
    }
}
