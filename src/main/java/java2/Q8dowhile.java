package java2;

import java.util.Scanner;

public class Q8dowhile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your word :");
        String word=sc.next();
        int n=word.length()-1;
        char a=word.charAt(0);
        char z=word.charAt(n);
        do {
            if(a==z)
            {
                System.out.println("First and last word of "+word+" are equal");
                break;
            }
            else
            {
                System.out.println("First and last word of "+word+" are not equal");
                break;
            }

        }
        while(!(word.equals("done")));
        {
            System.out.println("Entered word was not dnoe");
        }
    }
}