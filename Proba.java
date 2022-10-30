import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double n = sc.nextInt();
       double fact;
       double answer = 0;
       for (double i = 1; n >= i; n--){

           fact = (1 / n);
           answer += (1 / n);



       }
        System.out.println(answer);


    }

    }

