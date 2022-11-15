package main;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, 21500, "Pravin");
        Employee employee2 = new Employee(10, 15000, "Sneha");
        Employee employee3 = new Employee(2, 26000, "AAA");
        Employee employee4 = new Employee(14, 25000, "BBB");

        List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);

       ListIterator listIterator = list.listIterator();

       while (listIterator.hasNext()){
           System.out.println(listIterator.next());
       }

    }


}

