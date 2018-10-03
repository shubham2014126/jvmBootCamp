package java8io;

import java.lang.*;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface operation1
{
    boolean greater(int a, int b);
}
interface operation2
{
    int increment(int x);
}
interface operation3
{
    String concatenate(String a, String b);
}
interface operation4
{
    String uppercase(String x);
}


public class functionalinterfaceQ1 {

    public static void main(String[] args)
    {
        operation1 o= ( a,  b) -> a>b ;
        System.out.println("Greatest among the number : " + o.greater(10,20));
        operation2 i= (x) -> ++x;
        System.out.println("Incremented number : " + i.increment(1));
        operation3 s= (a,b) -> a+b;
        System.out.println("Concatenated String : " + s.concatenate("Hello ","World"));
        operation4 u= (x) -> x.toUpperCase();
        System.out.println("Converted to uppercase : "+ u.uppercase("hello"));
    }

}
