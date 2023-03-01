package NewTask;

import java.util.Stack;

public class Encryption {

    public static void massage(String massage) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < massage.length(); i++) {
            char element = massage.charAt(i);
            if (element != ' ') {
                stack.push(element);
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
            if ((i + 1) % 5 == 0){
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
