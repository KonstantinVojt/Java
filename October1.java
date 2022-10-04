import java.util.Scanner;

public class October1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Темрепатупа воздуха: ");
        int degrees = sc.nextInt();
        System.out.println("Температура воды: ");
        int degrees1 = sc.nextInt();
        System.out.println("Ехать(true), Не ехать(false):");
        System.out.println();
        boolean air_water = (degrees > 28) && (degrees1 > 26);
        System.out.println(air_water);










    }

}
