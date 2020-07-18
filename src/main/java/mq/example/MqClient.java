package mq.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MqClient {

    public  void produce(String msg) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), BrokerServer.PORT);

        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(msg);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  String consume() throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), BrokerServer.PORT);
        String message = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("CONSUME");
            out.flush();

            message = in.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;


    }

}
