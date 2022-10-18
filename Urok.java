import java.util.Scanner;

public class Urok {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int number = scanner.nextInt();



        if (number % 2 == 0) {
            System.out.println(number + 2);

        }

        else {
            System.out.println(number + 1);
        }


        

    }
}
