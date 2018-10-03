package java8io;

import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.function.*;


public class functionalinterfaceQ2 {

    public static void main(String[] args)
    {
        // COMSUMER EXAMPLE
        System.out.println("COMSUMER EXAMPLE");
        Consumer<String> c= s-> System.out.println(s);
        c.accept("Hello");
        c.accept("Hi");
        System.out.println();
        // SUPPLIER EXAMPLE
        System.out.println("SUPPLIER EXAMPLE");
        Supplier<String> otps=()-> {String otp="";
            for(int i=0;i<4;i++)
            {
                otp=otp+(int)(Math.random()*10);                 //Random Numbers Within a Given Range
            }                                                    // (Math.random() * ((max - min) + 1)) + min
            return otp;};
        System.out.println(otps.get());
        System.out.println();
        // PREDICATE EXAMPLE
        System.out.println("PREDICATE EXAMPLE");
        Predicate<Integer> p= (x) -> (x%2==0) ? true : false ;
        System.out.println(p.test(7));
        System.out.println();
        // FUNCTION EXAMPLES
        System.out.println("FUNCTION EXAMPLES");
        BiFunction<Integer,Integer,Integer> bi = (x, y) -> { return x + y; };
        System.out.println(bi.apply(10,20));
        System.out.println();
        Function<Integer,Integer> f=(x) -> {return x/2;};
        System.out.println(f.apply(2));
    }


}
