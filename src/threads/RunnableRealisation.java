package threads;

public class RunnableRealisation implements Runnable{
    StringBuffer builder;
    char letter;

    public RunnableRealisation(StringBuffer builder, char letter) {
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
