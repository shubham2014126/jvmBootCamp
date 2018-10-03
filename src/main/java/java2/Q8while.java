package java2;

import java.util.Scanner;
import java.lang.String;

public class Q8while {
   public static void main(String[] args)

   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Word");
       String word=s.next();
       int n=word.length()-1;
       char a=word.charAt(0);
       char z=word.charAt(n);
       while (!(word.equals("done")))
       {
           if(a==z) {
               System.out.println("First and last words of" + word + "are equal");
               break;

           }
           else
           {
               System.out.println("First and last words of"+word+"are not equal");
               break;
           }
       }
   }





}
