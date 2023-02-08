package homework;

import java.util.ArrayList;
import java.util.List;

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


        Worker worker = new Worker();

        List<Person> children = new ArrayList<>();

        Worker firstChild = new Worker();
        firstChild.setName("Elvis");

        Worker secondChild = new Worker();
        secondChild.setName("Pinocchio");

        children.add(firstChild);
        children.add(secondChild);

        worker.setChild(children);

        worker.infoAboutChildren();


        Company company = new Company("Microsoft");
        Company company2 = new Company("Apple");
        Company company3 = new Company("Google");
        List<Company> companyList = new ArrayList<>();

        companyList.add(company);
        companyList.add(company2);
        companyList.add(company3);
        worker.setCompanies(companyList);

        worker.infoAboutCompany();

//        person.setAge(90);
//        person.die();

//        worker.setAge(50);
//        worker.setMinSalary(1000);
//        worker.setMaxSalary(2000);

//        worker.die();

//        worker2.die();
//
//        System.out.println(worker.calculatePension());




    }
}
