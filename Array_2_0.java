import java.util.Arrays;

public class Array_2_0 {
    public static void main(String[] args) {
        int[] chars = new int [100];

        for (int i=1; i<100; i++){

            if (i % 10 == 1) {
                chars[i] = 111;
            }
            if (i % 10 == 2) {
                chars[i] = 222;
            }
            if (i % 10 == 3) {
                chars[i] = 333;
            }
            if (i % 10 == 4) {
                chars[i] = 444;
            }
            if (i % 10 == 5) {
                chars[i] = 555;
            }
            if (i % 10 == 6) {
                chars[i] = 666;
            }
            if (i % 10 == 7) {
                chars[i] = 777;
            }
            if (i % 10 == 8) {
                chars[i] = 888;
            }
            if (i % 10 == 9) {
                chars[i] = 999;
            }
            if (i % 10 == 0) {
                chars[i] = 0;
            }
        }
        System.out.println(Arrays.toString(chars));
        int sum = 0;
        for (int i=1; i<100; i++){
            sum += chars[i];
        }
        System.out.println(sum);

    }
}
