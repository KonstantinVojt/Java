import java.util.Scanner;

public class NewUrok {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        System.out.println("Время в пути:");
        int time = scanner.nextInt();
        System.out.println("Скорость поезда:");
        int speed = scanner.nextInt();
        System.out.println("Длина полного пути:");
        int distance = scanner.nextInt();

        if ( 0 < time * speed && time * speed < distance / 2) {
            System.out.println("Шерлок");
        }
        if ( time * speed >= distance / 2 && time * speed <= distance ) {
            System.out.println("Мэри");
        }
        if (time * speed > distance) {
            System.out.println("Эх... Джон поехал не туда");
        }
        if (time * speed < 0) {
            System.out.println("ERROR");
        }
    }
}
