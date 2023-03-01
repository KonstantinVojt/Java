package homework;

public class Pensioner extends Person {

    private double pension;


    public Pensioner(String name, int age, double growth, double theWeight) {
        super(name, age, growth, theWeight);
        this.pension = pension;
    }

    @Override
    public void die() {
//        double x = (getAge() - 50) * pension;
//        System.out.println("Этот пенсионер умер, он заработал: " + x);

        int countChildren = 0;
        if (getChild() != null) {
            countChildren = getChild().size();
        }
        System.out.println("Зато у меня " + countChildren + " детей");
    }

    @Override
    public void comparisonWorker(Worker workerOne, Worker workerTwo) {

    }

    @Override
    public void comparisonPensioner(Pensioner pensionerOne, Pensioner pensionerTwo) {
        if (pensionerOne.getName().length() > pensionerTwo.getName().length()) {
            System.out.println(pensionerOne.getName() + " длинее чем имя " + pensionerTwo.getName());
        } else if (pensionerOne.getName().length() < pensionerTwo.getName().length()) {
            System.out.println(pensionerTwo.getName() + " длинее чем имя " + pensionerOne.getName());
        } else {
            if (pensionerOne.getAge() > pensionerTwo.getAge()) {
                System.out.println(pensionerOne.getName() + " старше чем " + pensionerTwo.getName());
            } else if (pensionerOne.getAge() < pensionerTwo.getAge()) {
                System.out.println(pensionerTwo.getName() + " старше чем " + pensionerOne.getName());
            } else {
                System.out.println(pensionerOne.getName() + " и " + pensionerTwo.getName() + " имеют одинаковую длину и возраст ");
            }
        }
    }
    public static void comparisonWorkerAndPensioner(Worker workerOne, Pensioner pensionerTwo) {
        if (workerOne.getName().length() > pensionerTwo.getName().length()) {
            System.out.println(workerOne.getName() + " длинее чем имя " + pensionerTwo.getName());
        } else if (workerOne.getName().length() < pensionerTwo.getName().length()) {
            System.out.println(pensionerTwo.getName() + " длинее чем имя " + workerOne.getName());
        } else {
            if (workerOne.getAge() > pensionerTwo.getAge()) {
                System.out.println(workerOne.getName() + " старше чем " + pensionerTwo.getName());
            } else if (workerOne.getAge() < pensionerTwo.getAge()) {
                System.out.println(pensionerTwo.getName() + " старше чем " + workerOne.getName());
            } else {
                System.out.println(workerOne.getName() + " и " + pensionerTwo.getName() + " имеют одинаковую длину и возраст ");
            }
        }
    }
    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void comparisonPensioner() {

    }

    @Override
    public void comparisonWorker() {

    }
}
