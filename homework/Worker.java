package homework;

import java.util.List;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;
    private static final int MONEY_PER_CHILD = 200;
    private List<Company> companies;
    private Set<PensionFund> pensionFunds;


    @Override
    public double calculatePension() {
        int addMoney = 0;
        if (getChild() != null) {
            addMoney = getChild().size() * MONEY_PER_CHILD;
        }
        double maxPension = 0.0;
        for (PensionFund fund : pensionFunds) {
            double result = fund.pensionCalculation(getAge(), minSalary + addMoney, maxSalary);
            if (result > maxPension){
                maxPension = result;
            }
        }
        return maxPension;
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

    public Set<PensionFund> getPensionFunds() {
        return pensionFunds;
    }

    public void setPensionFunds(Set<PensionFund> pensionFunds) {
        this.pensionFunds = pensionFunds;
    }
}
