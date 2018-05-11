package exercise3;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        String[] arr = {"aa","ab","ac","ad","ae"};
        for (int i = 0; i < arr.length; i++) {//替换前
            System.out.print(arr[i]+",");
        }
        System.out.println();
        Arrays.fill(arr,2,3,"bb");//进行元素替换

        for (int i = 0; i < arr.length; i++) {//替换后
            System.out.print(arr[i]+",");
        }
    }
}
