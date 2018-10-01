class b {

    public int add(int a, int b){

        int sum = a+b;
        return sum;
    }

    // adding two doubles
    public double add(double a, double b){

        double sum = a+b;
        return sum;
    }

    // multiplying two doubles
    public double multiply(double a, double b){

        double multiply = a*b;
        return multiply;
    }

    // multiplying two integers
    public int multiply(int a, int b){

        int multiply = a*b;
        return multiply;
    }

    //concat two strings
    public String join(String a , String b)
    {
        String str = a.concat(b);

        return str; }

}

public class Q10 {
    public static void main (String[] args) {

        b ab = new b();

        int sum2 = ab.add(4,5);
        System.out.println("sum of the two integer value :" + sum2);
        double sum3 = ab.add(2.0,3.0);
        System.out.println("sum of the two double value :" + sum3);

        Q10 xy = new Q10();

        double product4 = ab.multiply(2.0,3.0);
        System.out.println("product of the two double value :" + product4);
        int product5 = ab.multiply(4,5);
        System.out.println("product of the two double value :" + product5);

        System.out.println(ab.join("Shubham","Virmani"));


    }

}
