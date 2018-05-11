package exercise1;

import java.util.Arrays;

public class CopyArr {

    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        int[] arr2=Arrays.copyOfRange(arr1,0,3);//复制数组
        out(arr1);
        System.out.println("");
        out(arr2);
    }
    public static void out(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
