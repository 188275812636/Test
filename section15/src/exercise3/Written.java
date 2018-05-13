package exercise3;

import java.io.*;

public class Written {
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter buf2 = new BufferedWriter(new FileWriter("test.txt"));
        System.out.println("请输入姓名密码（输入done退出）：");
        String str = buf.readLine();
        while(!str.equals("done")){//制造循环，当输入的字符为done时退出
            buf2.write(str);
            buf2.newLine();
            str = buf.readLine();
        }
        System.out.println("已退出");
        buf.close();
        buf2.close();
    }
}
