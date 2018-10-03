public class Q6
{

    public static void repele(int [] a){
        if(a.length==0)
        return;
        int xor = a[0];
        for (int i = 1; i<a.length ; i++)
        {
        xor ^= a[i];
        }
        System.out.println("Element appear only once in array - " + xor);
        }

    public static void main (String[] args) {
        int[] a = {1, 2, 3, 4, 1, 3, 4};
        repele(a);


    }
    }



