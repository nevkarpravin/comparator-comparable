package main;


import java.util.Optional;

public class DateExample {

    public static void main(String[] args) {

        String[] array = new String[10];

        Optional<String> checkNull = Optional.ofNullable(array[5]);
        if(checkNull.isPresent()) {
            System.out.println("String is not null");
        } else {
            System.out.println("String is null");
        }

    }
}
