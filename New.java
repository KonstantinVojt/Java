import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int password = line.length();
        char number = line.charAt(password - 1);

        if (password < 6 || number != '!') {
            System.out.println("Ваш пароль неверный");
        }
        else{
            System.out.println("пароль принят");
        }
    }
}
