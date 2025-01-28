package synchronization;

import java.util.function.Consumer;

public class Caller implements Runnable{
    String msg;
    Thread t;
    Consumer<String> consumer;

    public Caller(Consumer<String> consumer, String msg) {
        this.msg = msg;
        this.consumer = consumer;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        consumer.accept(msg);
    }
}
