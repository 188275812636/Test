package exercise1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入内容：");
        String str=scan.next();
        byte b[]=str.getBytes();
        System.out.println("请输入文件名：");
        String name = scan.next();
        File f=new File(name);
        OutputStream out=new FileOutputStream(f);
        out.write(b);
        out.close();
    }
}
