package homework;

public class Homework1 {
    public static void main(String[] args) {

        Person person = new Person("Jack", 20, 1.75, 80);
        Person person1 = new Person();

        person1.info();
        person1.needToWork();

        System.out.println(" ");

        person.info();
        person.needToWork();

        System.out.println(" ");
        System.out.print("Money: ");

        person.money = person.getMoney(30);
        System.out.println(person.money);

    }
}
