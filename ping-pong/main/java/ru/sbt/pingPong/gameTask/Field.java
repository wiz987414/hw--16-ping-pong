package ru.sbt.pingPong.gameTask;

public class Field {
    private volatile boolean isPing;

    public Field() {
        this.isPing = false;
    }

    boolean isPing() {
        return isPing;
    }

    void setPing(boolean ping) {
        isPing = ping;
    }
}
