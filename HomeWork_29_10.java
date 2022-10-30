import java.util.Scanner;

public class HomeWork_29_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0){
            sum += number % 10;
            number = number / 10;

        }
        System.out.print(sum + " ");

    }
}
