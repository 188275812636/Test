package exercise2;

import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {
        format("#.#####",area(2));
    }
    public static void format(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);//数字进行格式化
        System.out.println(output);
    }
    public static double area(double r){
        double s;
        s = Math.PI*r*r;
        return s;
    }
}
