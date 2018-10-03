package java8io;

@java.lang.FunctionalInterface
interface calculation
{
    int operation(int a,int b);
}

public class calc {

    public static void main(String[] args)
    {
        calculation add=(a,b) ->  a+b ;
        calculation sub=(a,b) ->  a-b ;
        calculation mul=(a,b) ->  a*b ;
        calculation div=(a,b) ->  a/b ;
        System.out.println(add.operation(5,6));
        System.out.println(sub.operation(5,6));
        System.out.println(mul.operation(5,6));
        System.out.println(div.operation(5,6));
    }

}
