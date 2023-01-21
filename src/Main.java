import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FileGenerator fileGenerator = new FileGenerator(10, 10);
        int[][] field = fileGenerator.generate();

//        FielPrinter fieldViewer = new FielPrinter(10);
//        fieldViewer.printField(field);

        Game game = new Game(field, 10, 10);
        game.start();

    }
}