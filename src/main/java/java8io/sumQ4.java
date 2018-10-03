package java8io;

import java.util.Arrays;
import java.util.List;

public class sumQ4 {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Entered list is "+list);
        System.out.println("Sum of numbers greater than 5 : "+list.stream().filter(e -> e >5).reduce(0, Integer::sum));
    }

}
