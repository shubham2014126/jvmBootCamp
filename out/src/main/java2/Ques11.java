public class Ques11 {

    public static void main(String[] args)
    {
        int s=0,i=0,j=0;
        int t=1;
        while (i<5)
 for(i=0;i<5;i++) {
     s = s + i;
     j = i;
     while (j > 0)
         for (j = i; j > 0; j--) {
             t = t * (j - i);
             j--;
         }
     s = s * t;
     System.out.println("T is" + t);
     i++;
 }
   System.out.println("S is"+s);
 }
    }


