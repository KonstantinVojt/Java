package homework;

public class Person {

    String name;

    int age;

    double growth;

    double theWeight;

    // С добавлением к полю money, "private", в программе
    // возникает проблема с вызовом этого поля.
    // Так просто его уже не вызвать.
    /*private*/ int money;

    public Person(String name, int age, double growth, double theWeight){
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.theWeight =theWeight;
    }

    public Person(){

    }

    public void info(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + growth);
        System.out.println("Вес: " + theWeight);
    }

    public void needToWork(){

        if (age < 18 || age > 70){
            System.out.println("Отдыхаю дома");
        }
        else {
            System.out.println("Работаю");
        }
    }

    public int getMoney(int money){
        return money;
    }
}
