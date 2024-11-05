package threads;

import threads.RunnableRealisation;

import threads.ThreadExtension;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 15;
        char startValue = 'A';
        Thread[] threads = new Thread[numberOfThreads];
        //region 1 way
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numberOfThreads; i++) {
//            final char letter = startValue++;
//            threads[i] = new ThreadExtension(sb, letter);
//            threads[i].start();
//        }
        //endregion
//
        //region 2 way
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numberOfThreads; i++) {
            final char letter = startValue++;
            threads[i] = new Thread(new RunnableRealisation(sb, letter));
            threads[i].start();
        }

        //endregion

        //region 3 way
        Thread thread = new Thread(() -> System.out.println("Hello World!"));
        thread.start();
        //endregion

        Thread.sleep(1000);
        System.out.println("Final output: \n" + sb.toString());
    }
}
