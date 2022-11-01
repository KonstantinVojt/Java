import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] chars = new int [100];
        for (int i=1; i<99; i++){
        chars[i] = 10;

        }
        System.out.println(Arrays.toString(chars));
    }
}
