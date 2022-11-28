package main;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> f = a -> a*a;
        Function<Integer, Integer> f1 = a -> a *2;
        System.out.println("Enter Number to square");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Square of num " + num + " is " + f.andThen(f1).apply(num));

    }
}
