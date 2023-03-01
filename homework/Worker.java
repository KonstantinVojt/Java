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
            if (result > maxPension) {
                maxPension = result;
            }
        }
        return maxPension;
    }

    @Override
    public void die() {
        System.out.println("Этот чловек не дожил до пенсии");
    }

    @Override
    public void comparisonWorker(Worker workerOne, Worker workerTwo) {
        if (workerOne.getName().length() > workerTwo.getName().length()) {
            System.out.println(workerOne.getName() + " длинее чем имя " + workerTwo.getName());
        } else if (workerOne.getName().length() < workerTwo.getName().length()) {
            System.out.println(workerTwo.getName() + " длинее чем имя " + workerOne.getName());
        } else {
            if (workerOne.getAge() > workerTwo.getAge()) {
                System.out.println(workerOne.getName() + " старше чем " + workerTwo.getName());
            } else if (workerOne.getAge() < workerTwo.getAge()) {
                System.out.println(workerTwo.getName() + " старше чем " + workerOne.getName());
            } else {
                System.out.println(workerOne.getName() + " и " + workerTwo.getName() + " имеют одинаковую длину и возраст ");
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

    @Override
    public void comparisonPensioner(Pensioner pensionerOne, Pensioner pensionerTwo) {

    }


    public void infoAboutCompany () {
            System.out.println("Я работал в следующих компаниях: ");
            boolean start = true;
            for (Company company : companies) {
                if (start) {
                    System.out.print(company.getName());
                    start = false;
                } else {
                    System.out.print(", " + company.getName());
                }
            }
        }

        public int getMinSalary () {
            return minSalary;
        }

        public void setMinSalary ( int minSalary){
            this.minSalary = minSalary;
        }

        public int getMaxSalary () {
            return maxSalary;
        }

        public void setMaxSalary ( int maxSalary){
            this.maxSalary = maxSalary;
        }

        public List<Company> getCompanies () {
            return companies;
        }

        public void setCompanies (List < Company > companies) {
            this.companies = companies;
        }

        public Set<PensionFund> getPensionFunds () {
            return pensionFunds;
        }

        public void setPensionFunds (Set < PensionFund > pensionFunds) {
            this.pensionFunds = pensionFunds;
        }


    @Override
    public void comparisonPensioner() {

    }

    @Override
    public void comparisonWorker() {

    }
}

