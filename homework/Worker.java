package homework;

import java.util.List;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;
    private static final int MONEY_PER_CHILD = 200;
    private List<Company> companies;


    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("sich", ThreeType.STATE, 25);
        int addMoney = 0;
        if (getChild() != null) {
            addMoney = getChild().size() * MONEY_PER_CHILD;
        }
        double result = pensionFund.pensionCalculation(getAge(), minSalary + addMoney, maxSalary);
        return result;
    }

    @Override
    public void die() {
        System.out.println("Этот чловек не дожил до пенсии");
    }

    public void infoAboutCompany() {
        System.out.println("Я работал в следующих компаниях: ");
        boolean start = true;
        for (Company company : companies) {
            if (start){
                System.out.print(company.getName());
                start = false;
            }
            else {
                System.out.print(", " + company.getName());
            }
        }
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

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
