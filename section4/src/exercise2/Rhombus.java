package exercise2;

public class Rhombus {
    public static void main(String args[]) {
        /*
        * 可以把菱形分为上下两个部分
        * */
        int height = 9;// 菱形的高度
        int mid = (height + 1) / 2;// 菱形中间一行
        for (int i = 1; i <= mid; i++) {// 菱形上半部分循环打印
            for (int j = 1; j <= mid - i; j++) {// 输出空格
                System.out.print("  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {// 输出星号
                System.out.print("* ");
            }
            System.out.println();// 换行
        }
        for (int i = 1; i <= height - mid; i++) {// 菱形下半部分打印
            for (int j = 1; j <= i; j++) {// 输出空格
                System.out.print("  ");
            }
            for (int k = 1; k <= (height - mid - i + 1) * 2 - 1; k++) {// 输出星号

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}