package exercise4;

public class Two_Array {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = new int[3][3];
        System.out.println("互调前：");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i <arr.length ; i++) {//横列变纵列
            for (int j = 0; j <arr[i].length ; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        System.out.println("互调后：");
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
