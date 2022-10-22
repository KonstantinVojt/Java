import java.util.Scanner;

public class Homework2110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;


        while(a > 1){

            a--;
            b = b * a;

            System.out.println(b);
        }


    }
}
