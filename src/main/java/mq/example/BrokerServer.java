package mq.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BrokerServer implements Runnable {

    public static final int PORT = 8888;

    private Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = in.readLine();
                if (str == null) {
                    continue;
                }
                System.out.println("接收到原始数据:" + str);

                if(str.equals("CONSUME")) {
                    String message = MyBroker.consume();
                    out.println(message);
                    out.flush();
                } else {
                    MyBroker.produce(str);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(PORT);
        System.out.println("start server");
        while (true) {
            BrokerServer brokerServer = new BrokerServer(ss.accept());
            new Thread(brokerServer).start();
        }

    }
}
