package main;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, 21500, "Pravin");
        Employee employee2 = new Employee(10, 15000, "Sneha");
        Employee employee3 = new Employee(2, 26000, "AAA");
        Employee employee4 = new Employee(14, 25000, "BBB");

        List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);
        Comparator<Employee> comparator = (o1, o2) -> 0;
        Collections.sort(list, comparator );

        SampleFunctionalInterface addition = (num1, num2) -> num1 + num2;
        SampleFunctionalInterface substraction = (num1, num2) -> num1 - num2;

       int result =  addition.operation(15, 25);
       int result1 = substraction.operation(25, 14);
        System.out.println("Addition is :" + result);
        System.out.println("substraction is :" + result1);

       ListIterator listIterator = list.listIterator();

       while (listIterator.hasNext()){
           System.out.println(listIterator.next());
       }

    }


}

