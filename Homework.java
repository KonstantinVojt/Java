import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1). ");

        String line = scanner.nextLine();


        int number = line.length();
        System.out.println(number);

        if (number >= 10){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.print("2). ");

        String startEnd = scanner.nextLine();



        int a = startEnd.charAt(0);
        int b = startEnd.charAt(startEnd.length() - 1);

        if (a == b){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
