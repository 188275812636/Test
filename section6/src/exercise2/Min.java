package exercise2;

public class Min {
    public static void main(String[] args) {
        int[] arr = {52,65,14,632,89,21,12,25};
        findMin(arr);
    }
    public static void findMin(int[] arr){
        int i ;
        int t = 0;
        for (i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<=arr[i+1]){//逐个比较找到最小值
                t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }
        System.out.println(t);
    }
}
