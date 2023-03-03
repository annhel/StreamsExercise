package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(17);
        nums.add(43);
        nums.add(50);
        nums.add(27);
        nums.add(40);
        nums.add(58);
        nums.add(29);

        //Map
        List<Integer> minusTwo = nums.stream().map(n -> n - 2).toList();
        System.out.println("Nums.Map: subtracted by 2");
        System.out.println(minusTwo);
        System.out.println();

        //Filter
        List<Integer> greaterThan20 = nums.stream().filter(n -> n > 20).toList();
        System.out.println("Nums.filter: filtered num > 20");
        System.out.println(greaterThan20);
        System.out.println();

        //Sort
        List<Integer> sortedNums= nums.stream().sorted().toList();
        System.out.println("Nums.sort: sorts numbers least to greatest");
        System.out.println(sortedNums);
        System.out.println();

        //ForEach
        System.out.println("Nums.forEach: Printed out each");
        nums.stream().forEach(n -> System.out.println(n));
        System.out.println();

        //Collect
        List<Integer> squaredNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Nums.map.collect: squared nums and created new array");
        System.out.println(squaredNums);
        System.out.println();

        //Reduce
        int sum = nums.stream().reduce(0, (total, num)-> total + num);
        System.out.println("Nums.reduce: reduced for the sum all nums");
        System.out.println(sum);
        System.out.println();


    }
}