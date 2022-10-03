import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите пожалуйста ваши оценки для подсчета среднего балла ");

        System.out.println("Классная работа: ");
        int classwork = s.nextInt();

        System.out.println("Домашняя раота: ");
        int homework = s.nextInt();

        System.out.println("Контпольная работа: ");
        int test = s.nextInt();



        System.out.print("Ваш средний балл: ");

        System.out.println( (classwork + homework + test) / 3 );
    }

}

