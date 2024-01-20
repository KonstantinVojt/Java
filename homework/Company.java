package homework;

import java.util.Map;

public class Company implements Comparable<Company> {

    private String nameCompany;

    private Map holidays;

//    public Company(String nameCompany) {
//        this.nameCompany = nameCompany;
//    }

    public Company(String nameCompany, Map holidays) {
        this.nameCompany = nameCompany;
        this.holidays = holidays;
    }

    public String getName() {
        return nameCompany;
    }

    public Map getHolidays() {
        return holidays;
    }

    public void setHolidays(Map holidays) {
        this.holidays = holidays;
    }

    @Override
    public int compareTo(Company o) {
        return nameCompany.compareTo(o.nameCompany);
        //0 - два объекта равны
        //<0, тогда наш изначальный объект "меньше"
        //>0, тогда наш изначальный объект "больше"
    }
}
