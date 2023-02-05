package homework;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;
    private static final int MONEY_PER_CHILD =  200;



    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("sich", ThreeType.STATE, 25);
        int addMoney = 0;
        if (getChild() != null) {
            addMoney = getChild().size() * MONEY_PER_CHILD;
        }
        double result = pensionFund.pensionCalculation(getAge(), minSalary + addMoney, maxSalary );
        return result;
    }

    @Override
    public void die() {
        System.out.println("Этот чловек не дожил до пенсии");
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

}
