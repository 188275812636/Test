package exercise1;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class Test {
    public static void main(String args[]) {
        try {
            InetAddress ip = InetAddress.getByName("8080");
            System.out.println("主机名：" + ip.getHostName());
            System.out.println("主机IP地址：" + ip.getHostAddress());
            System.out.println("本机IP地址：" + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

