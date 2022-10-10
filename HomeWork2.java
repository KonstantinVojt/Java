import java.util.Locale;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        line = line.toLowerCase();


        line = line.replace('a', '~');
        line = line.replace('b','a');
        line = line.replace('~','b');

        System.out.println(line);
    }
}
