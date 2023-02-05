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

        Pensioner person = new Pensioner("Bob", 40, 40, 70);
        Worker worker = new Worker();
        Person worker2 = new Worker();

        List<Person> list =new ArrayList<>();
        list.add(worker);
        list.add(person);
        list.add(worker2);
        worker.setChild(list);

        System.out.println(worker.getChild());

//        person.setPension(2500);
//        person1.die();
//
//        person.setAge(90);
//        person.die();
        worker.setAge(50);
        worker.setMinSalary(1000);
        worker.setMaxSalary(2000);
//        worker.die();

        worker2.die();

        System.out.println(worker.calculatePension());




    }
}
