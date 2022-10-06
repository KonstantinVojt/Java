import java.util.Scanner;

public class October1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Темрепатупа воздуха: ");
        int air = sc.nextInt();
        System.out.println("Температура воды: ");
        int water = sc.nextInt();
        System.out.println("Ехать(true), Не ехать(false):");
        System.out.println();
        boolean answer = (air > 28) && (water > 26);
        System.out.println(answer);










    }

}
