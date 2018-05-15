package exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    static List<Socket> clients;
    static ServerSocket server;

    public static void main(String[] args) {
        try {
            clients = new ArrayList<Socket>();
            server = new ServerSocket(8080);
            System.out.println("服务器已启动...");
            while (true) {
                Socket socket = server.accept();//启动监听
                clients.add(socket);
                Mythread mythread = new Mythread(socket);
                mythread.start();
            }
        } catch (Exception ex) {
        }
    }
    static class Mythread extends Thread {
        Socket socket;
        private BufferedReader br;
        private PrintWriter pw;
        public String msg;
        public Mythread(Socket s) {
            socket = s;
        }
        public void run() {
            try {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                msg = socket.getInetAddress() + "进入聊天室,当前聊天室有" + clients.size() + "人";
                sendMsg();
                while ((msg = br.readLine()) != null) {
                    msg =  socket.getInetAddress() + "：" + msg;
                    sendMsg();
                }
            } catch (Exception ex) {
            }
        }
        /**
         * 发送消息
         */
        public void sendMsg() {
            try {
                System.out.println(msg);
                for (int i = clients.size() - 1; i >= 0; i--) {
                    pw = new PrintWriter(clients.get(i).getOutputStream(), true);
                    pw.println(msg);
                }
            } catch (Exception ex) {
            }
        }
    }
}
