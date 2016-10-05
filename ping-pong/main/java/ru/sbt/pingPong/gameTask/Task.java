package ru.sbt.pingPong.gameTask;

public class Task implements Runnable {
    private final Player player;
    private final Field field;

    public Task(Player player, Field field) {
        this.player = player;
        this.field = field;
    }

    @Override
    public void run() {
        while (true) {
            if (this.player.getClass() == PingPlayer.class) {
                synchronized (this.field) {
                    if (!this.field.isPing()) {
                        this.player.throwBall();
                        this.field.setPing(true);
                    }
                }
            } else {
                synchronized (this.field) {
                    if (this.field.isPing()) {
                        this.player.throwBall();
                        this.field.setPing(false);
                    }
                }
            }
        }
    }
}
