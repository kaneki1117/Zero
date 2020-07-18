package mq.example;

import java.util.concurrent.ArrayBlockingQueue;

public class MyBroker {

    public static final int MAX_SIZE = 8;

    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    public static void produce(String msg) {
        if(messageQueue.offer(msg)) {
            System.out.println("Send Msg to Center success, Msg: " + msg);
        } else {
            System.out.println("Msg Center is lack of capacity: " + msg);
        }

        System.out.println("--------");
    }

    public static String consume() {
        String msg = messageQueue.poll();

        if(msg != null) {
            System.out.println("rcv Msg success, Msg: " + msg);
        } else {
            System.out.println("Msg Center is empty ");
        }
        System.out.println("--------");

        return msg;
    }


}
