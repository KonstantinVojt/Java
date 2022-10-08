import java.util.Scanner;

public class Urok {

    public static void main(String[] args) {

        //long a = 3_145_677_567L;
        //System.out.println(a);

       // a = a * 6;
       // System.out.println(a);




    //long mol = 4_256_567_567_455L;
    //int covid = 16;

    //mol = mol * covid;
    //System.out.println(mol);




       //Scanner s = new Scanner(System.in);

        //System.out.println("Введите пожалуйста ваши оченки для подсчета среднего балла ");

        //System.out.println("Классная работа: ");
        //int classwork = s.nextInt();

        //System.out.println("Домашняя раота: ");
        //int homework = s.nextInt();

        //System.out.println("Контпольная работа: ");
        //int test = s.nextInt();



        //System.out.print("Ваш средний балл: ");

        //System.out.println( (classwork + homework + test) / 3 );



        // Scanner scanner = new Scanner(System.in);

       /* String password = scanner.nextLine();

        password = "D" + password; //1 step 1 шаг
        System.out.println(password);

        int size = password.length() - 5;
        password = password + size; //2 step 2 шаг

        password = password.replace('z', '~');
        password = password.replace('a', 'z'); //3 step
        System.out.println(password);

        char symbol = password.charAt(3);

        int length = password.length();
        char last = password.charAt(length);
        System.out.println(symbol);*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Год высокосный?");

        int yer = scanner.nextInt();
        int one = 4;
        int two = 100;
        int three = 400;


        if (yer / one != 0 && yer % two == 0 || yer / three != 0) {

            System.out.println("Высокосный");
        }

        else {
            System.out.println("noy");
        }






       // String s = scanner.nextLine();

        /*s = s.toLowerCase();

        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 10));

        s = s.replace('a','z');
        s = s.replace('b','y');
        s = s.replace('c','x');
        System.out.println(s);*/





        //Scanner s = new Scanner(System.in);

        //int echo = s.nextInt();
        //String echo = s.nextLine();

        //System.out.println("hahaha" + echo);





        //boolean a = 5 > 6;
       // boolean b = 0 == 0;

        //System.out.println(a);
        //System.out.println(a);












        //boolean correct = true;







    }
}
