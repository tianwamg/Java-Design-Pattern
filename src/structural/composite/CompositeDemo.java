package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("a","ceo","center");
        Employee s1 = new Employee("b","employee","s1");
        Employee s2 = new Employee("c","employee","s1");
        ceo.add(s1);
        ceo.add(s2);
        System.out.println(ceo);
        for (Employee employee : ceo.getSubordinates()) {
            System.out.println(employee);

        }
    }
}
