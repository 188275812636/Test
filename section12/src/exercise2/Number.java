package exercise2;

public class Number {
    public static double count(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(count(4.5,4.2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
