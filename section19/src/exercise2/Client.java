package exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    static Socket socket = null;
    public static void main(String[] args) {
        try {
            socket = new Socket("localhost", 8080);
            new Cthread().start();//启动线程
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg1;
            while ((msg1 = br.readLine()) != null) {
                System.out.println(msg1);
            }
        } catch (Exception e) {
        }
    }
    static class Cthread extends Thread {
        public void run() {
            try {
                BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                String msg2;
                /**
                 * 持续发送消息
                 */
                while (true) {
                    msg2 = re.readLine();
                    pw.println(msg2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
