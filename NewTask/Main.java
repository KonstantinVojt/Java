package NewTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сообщение: ");

        String massage = scanner.nextLine();
        System.out.println();

        System.out.println("Расшифрованный вариант:");
        String str = Encryption.massage(massage);

        System.out.println();
        System.out.println();

        System.out.println("Зашифрованный вариант:");
        System.out.println(str);

        // евирП,т имр
        // ямерВ дебоьта
    }
}
