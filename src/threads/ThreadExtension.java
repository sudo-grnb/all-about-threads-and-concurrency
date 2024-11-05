package threads;

public class ThreadExtension extends Thread {
    StringBuilder builder;
    char letter;

    public ThreadExtension(StringBuilder builder, char letter) {
        this.builder = builder;
        this.letter = letter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 150; i++) {
            builder.append(letter);
        }

        builder.append('\n');
    }
}
