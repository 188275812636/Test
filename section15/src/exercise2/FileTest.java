package exercise2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {
    public static void main(String[] args) {
        char a[] = "今天天气晴朗".toCharArray();
        int n = 0;
        try {
            File out = new File("hidden.txt");//创建文件
            FileWriter fw = new FileWriter(out);
            fw.write(a, 0, a.length);//写入数据
            fw.flush();
            FileReader fr = new FileReader(out);
            System.out.println("加密前：");
            char chars[] = new char[10];
            while ((n = fr.read(chars, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    chars[j] = (char) (chars[j]);
                }
                String str = new String(chars, 0, n);
                System.out.println(str);
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'a');//取异或操作，相当于加密
            }
            fw.write(a, 0, a.length);
            fw.flush();
            System.out.println("加密后：");
            while ((n = fr.read(chars, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    chars[j] = (char) (chars[j]);//若读取操作没有相应的异或操作，则无法读取到真实内容
                }
                String str = new String(chars, 0, n);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
