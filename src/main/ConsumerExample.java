package main;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;

        System.out.println("Enter number to print");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        consumer.accept(num);
    }
}
