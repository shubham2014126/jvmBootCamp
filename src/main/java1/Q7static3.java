public class Q7static3 {

    //STATIC BLOCK

    static int age;
    static String First_name ;
    static String Last_name ;
    static{
        age = 22;
        First_name = "Shubham";
        Last_name = "Virmani";
    }
    public static void main(String args[])
    {
        System.out.println("age:" +age);
        System.out.println("First_name:" +First_name);
        System.out.println("Last_name:" +Last_name);
    }
}


