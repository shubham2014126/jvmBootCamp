package java8io;

import java.util.Arrays;
import java.util.List;


public class evenQ3 {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Even Numbers in list : ");
        list.stream().filter(i->(i%2==0)).forEach(System.out::println);
    }

}
