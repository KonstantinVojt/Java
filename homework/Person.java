package homework;

//import java.util.ArrayList;

import java.util.List;

public abstract class Person {

    private static String president;
    private String name;
    private int age;
    private double growth;
    private double theWeight;
    private int money;
    private List<Person> child;


    public Person(String name, int age, double growth, double theWeight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.theWeight = theWeight;
    }

    public Person() {

    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + growth);
        System.out.println("Вес: " + theWeight);
    }

    public void needToWork() {

        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю");
        }
    }

    public void infoAboutChildren() {
        int counter = 0;
        System.out.println("У меня " + child.size() + " детей");
        for (Person children : child) {
            counter++;
            System.out.println(counter + ") " + children.name);
        }
    }

    public static String getPresident() {
        return president;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }

    public double getTheWeight() {
        return theWeight;
    }

    public int getMoney() {
        return money;
    }


    public static void setPresident(String president) {
        Person.president = president;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public void setTheWeight(double theWeight) {
        this.theWeight = theWeight;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Person> getChild() {
        return child;
    }

    public void setChild(List<Person> child) {
        this.child = child;
    }

    public abstract void die();

}
