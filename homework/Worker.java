package homework;

public class Worker extends Person {

    private int minSalary;
    private int maxSalary;


//    public Worker(String name, int age, int growth, int theWeight) {
//
//    }

    @Override
    public void die() {
        System.out.println("Этот чловек не дожил до пенсии");
    }
}
