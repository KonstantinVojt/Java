package homework;

public class Pensioner extends Person {

    private double pension;


    public double x(){
        double result = (getAge() - 50) * pension;
        return result;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + x());
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}
