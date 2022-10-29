import java.util.Scanner;

public class HomeWork_27_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer;
        for ( int i = 2; i <= n; i++) {
            answer = n / i;

            if (n % i == 0 && i < answer) {
                System.out.println(i);
                break;
            }
            if (i > answer){
                System.out.println(n);
                break;
            }






        }

    }
}




