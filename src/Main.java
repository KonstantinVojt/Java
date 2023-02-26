import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(1);

        ArrayList<Integer> arr = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.size();
        list.print();
//        list.remove(2);
//        list.print();
        list.add(1, 3);
        list.print();



        System.out.println("-_-_-_-_-_-_");

        arr.add(7);
        arr.add(3);
        arr.size();
        System.out.println(arr);
//        arr.remove(1);
//        System.out.println(arr);
        arr.add(1, 4);
        System.out.println(arr);


//        TreeSetImplementation treeSetImplementation = new TreeSetImplementation();
//        treeSetImplementation.add(1);
//        treeSetImplementation.add(10);
//        treeSetImplementation.add(100);

//        System.out.println(treeSetImplementation.root.value);
//        System.out.print(treeSetImplementation.root.left);
//        System.out.print("  ");
//        System.out.println(treeSetImplementation.root.right.value);

//        System.out.println(treeSetImplementation.root.right.right.value); // Останній елемент


//        for (int i = 0; i < 123; i++) {
//            list.add(i);
//        }
//        System.out.println(Arrays.toString(list.array));


//        LinkedListImplementation linkedList = new LinkedListImplementation();
//        linkedList.add(5);
//        linkedList.add(2);
//        linkedList.add(4);

//        System.out.println(linkedList.head);
//        System.out.println(linkedList.head.right);
//        System.out.println(linkedList.head.right.right);


    }
}
