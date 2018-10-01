import java.util.Scanner;

public class Ques7 {

public static void main(String[] args)
{
    double sec,hr,min,days;
    System.out.println("Enter Seconds=");
    Scanner s=new Scanner(System.in);
    sec=s.nextInt();
    days=sec/(60*60*24);
    sec=sec%(24*3600);
    hr=sec/3600;
    sec=sec%3600;
    min=sec/60;
    sec=sec%60;
    System.out.println("Minutes:"+min);
    System.out.println("Hours:"+hr);
    System.out.println("Days:"+days);
}

}
