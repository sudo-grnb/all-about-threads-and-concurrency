package threads;

public class Main {

    public static void main(String[] args)  {
        char startValue = 'A';

        //1 way
        Thread extendedThread = new ThreadExtension(startValue);
        extendedThread.start();

        //2 way
        Thread runnableRealisation = new Thread(new RunnableRealisation(++startValue));
        runnableRealisation.start();

        //3 way
        final char letter = (char) (startValue + 1);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 150; i++) {
                System.out.print(letter);
            }

            System.out.println();
        });
        thread.start();
    }
}
