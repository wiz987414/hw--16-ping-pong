package ru.sbt.pingPong;

import ru.sbt.pingPong.gameTask.*;

public class PingPong {
    public static void main(String[] args) {
        System.out.println("=========================");
        Field field = new Field();
        Thread thread1 = new Thread(new Task(new PingPlayer(), field));
        Thread thread2 = new Thread(new Task(new PongPlayer(), field));
        thread1.start();
        thread2.start();
    }
}
