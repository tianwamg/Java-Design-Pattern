package structural.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {

    private String name;
    private String position;
    private String dept;

    private List<Employee> subordinates;

    public Employee(String name, String position, String dept) {
        this.name = name;
        this.position = position;
        this.dept = dept;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", dept='" + dept + '\'' +
                ", suboridinates=" + subordinates +
                '}';
    }
}
