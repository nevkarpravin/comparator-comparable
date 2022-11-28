package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(15, 45, 78, 65, 43, 85, 88);
        List<Integer> evenNumberList = new ArrayList<>();
        for(int num: numList){
            if(num % 2== 0){
                evenNumberList.add(num);
            }
        }

         numList.parallelStream().forEach(System.out::println);
       System.out.println(numList.stream().reduce(0, Integer::sum));
        List<Integer> sortList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);
    }
}
