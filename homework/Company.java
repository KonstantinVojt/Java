package homework;

import java.util.Map;

public class Company {

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
}
