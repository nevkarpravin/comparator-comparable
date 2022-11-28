package main;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> p = (a) -> a >= 18;
        Predicate<Integer> p1 = a -> a <= 60;   // && , || , !
        System.out.println("Enter Age ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(p.and(p1).test(age)){
            System.out.println("User has valid age");
        } else {
            System.out.println("User age is less than 18");
        }
    }
}
