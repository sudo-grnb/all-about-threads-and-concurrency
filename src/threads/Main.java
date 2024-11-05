import threads.RunnableRealisation;
import threads.ThreadExtension;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 15;
        char startValue = 'A';
        Thread[] threads = new Thread[numberOfThreads];
        //region
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numberOfThreads; i++) {
//            final char letter = startValue++;
//            threads[i] = new ThreadExtension(sb, letter);
//            threads[i].start();
//        }
        //endregion
//

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numberOfThreads; i++) {
            final char letter = startValue++;
            threads[i] = new Thread(new RunnableRealisation(sb, letter));
            threads[i].start();
        }

        Thread.sleep(1000);
        System.out.println("Final output: \n" + sb.toString());
    }
}
