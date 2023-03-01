package homework;

import java.util.*;

public class ManUnderExperiment {
    public static void main(String[] args) {

//        Pensioner person = new Pensioner();

//        Worker person2 = new Worker("Bob", 3, 40, 70);


//        person1.info();
//        person1.needToWork();
//
//        System.out.println(" ");
//
//        person.info();
//        person.needToWork();
//
//        System.out.println(" ");
//        System.out.print("Money: ");
//
//        person.setMoney(30);
//        System.out.println(person.getMoney());
//
//        person.die();

//         --------------

/**       ---------------     **/


//        Worker worker = new Worker();
//        Worker worker2 = new Worker();
//
//        List<Person> children = new ArrayList<>();
//
//        Set<PensionFund> set = new HashSet<>();
//        Set<PensionFund> set2 = new HashSet<>();
//
//        Worker firstChild = new Worker();
//        firstChild.setName("Elvis");
//
//        Worker secondChild = new Worker();
//        secondChild.setName("Pinocchio");
//
//        children.add(firstChild);
//        children.add(secondChild);
//
//        worker.setChild(children);
//
//        worker.infoAboutChildren();
//
//
//        Company company = new Company("Microsoft");
//        Company company2 = new Company("Apple");
//        Company company3 = new Company("Google");
//        List<Company> companyList = new ArrayList<>();
//
//        companyList.add(company);
//        companyList.add(company2);
//        companyList.add(company3);
//        worker.setCompanies(companyList);
//
//        System.out.println("");
//        worker.setAge(50);
//        worker.setMinSalary(1000);
//        worker.setMaxSalary(2000);
//
//        worker2.setAge(50);
//        worker2.setMinSalary(1000);
//        worker2.setMaxSalary(2000);
//
//        PensionFund pensionFund = new PensionFund("Sat", TypeOfFund.STATE, 3000);
//        PensionFund pensionFund2 = new PensionFund("Set", TypeOfFund.STATE, 2000);
//        set.add(pensionFund);
//        set2.add(pensionFund2);
//
//        worker.setPensionFunds(set);
//        worker2.setPensionFunds(set2);
//
//        System.out.println(worker.calculatePension());
//        worker.infoAboutCompany();
//
//        System.out.println("");
//
//        System.out.println(worker2.calculatePension());

        /**  ----------- **/
//        worker2.infoAboutCompany();
//        ---


//---------

//        person.setAge(90);
//        person.die();

//        worker.setAge(50);
//        worker.setMinSalary(1000);
//        worker.setMaxSalary(2000);

//        worker.die();

//        worker2.die();
//
//        System.out.println(worker.calculatePension());

        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        map.put("Новый год ", " 31 декабря");
        map2.put("Рождество Христово ", " 25 декабря");
        map3.put("День всех святых ", " 1 ноября");

        Company company = new Company("Microsoft", map);
        Company company2 = new Company("Apple", map2);
        Company company3 = new Company("Google", map3);

        System.out.print(company.getName() + " ");
        System.out.println(company.getHolidays());

        System.out.print(company2.getName() + " ");
        System.out.println(company2.getHolidays());

        System.out.print(company3.getName() + " ");
        System.out.println(company3.getHolidays());

        System.out.println();

        Pensioner pensioner = new Pensioner("Bob", 3, 40, 70);
        Pensioner pensioner2 = new Pensioner("Jim", 3, 40, 70);

        pensioner.comparisonPensioner(pensioner, pensioner2);

        System.out.println();
        System.out.println("------------");
        System.out.println();

        Worker worker = new Worker();
        Worker worker2 = new Worker();
        worker.setName("Elvis");
        worker2.setName("Pinocchio");
        worker.setAge(5);
        worker2.setAge(6);

        worker.comparisonWorker(worker, worker2);

        Worker.comparisonWorkerAndPensioner(worker, pensioner2);
    }
}
