import java.util.Scanner;

public class Bank_29_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш вкад: ");
        int x = sc.nextInt();
        System.out.println("Какой процент хотите: ");
        int p = sc.nextInt();
        System.out.println("На сколько лет: ");
        int k = sc.nextInt();
        System.out.println("Ваш результат: ");
        for(int i = 0; i < k; i++) {
             x = x + (x * p / 100);
        }
        System.out.println(x);

        }

    }

