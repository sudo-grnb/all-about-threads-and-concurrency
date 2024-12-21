package threads;

public class RunnableRealisation implements Runnable{
    char letter;

    public RunnableRealisation(char letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.print(letter);
        }

        System.out.println();
    }
}
