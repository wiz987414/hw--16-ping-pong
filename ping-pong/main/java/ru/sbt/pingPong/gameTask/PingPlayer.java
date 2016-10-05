package ru.sbt.pingPong.gameTask;

public class PingPlayer implements Player {
    @Override
    public void throwBall() {
        System.out.println("> ping <");
    }
}
