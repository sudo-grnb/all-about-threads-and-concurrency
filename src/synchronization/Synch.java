package synchronization;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target::call, "Добро пожаловать");
        Caller ob2 = new Caller(target::call1, "в синхронизированный");
        Caller ob3 = new Caller(target::call2, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
