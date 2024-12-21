package threads;

public class ThreadExtension extends Thread {
    char letter;

    public ThreadExtension(char letter) {
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
