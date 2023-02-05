import java.util.ArrayList;
import java.util.LinkedList;

public class ArrAndLinked {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();


        arr.add("Bob");
        arr.add("Djo");
        arr.add("Elvis");

        System.out.println(arr);

        linked.add("Marvin");
        linked.add("Mars");
        linked.add("Marty");

        arr.set(1, "Bob");
        arr.remove(2);

        linked.addAll(arr);
        System.out.println(linked);
        System.out.println(arr);

        String maxStaring = "";
        for (String s : linked) {
            if (s.length() > maxStaring.length()){
                maxStaring = s;
            }
        }
        System.out.println(maxStaring);
    }
}
