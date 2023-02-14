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
        if (getChild() != null){
            countChildren = getChild().size();
        }
        System.out.println("Зато у меня " + countChildren + " детей");
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}

