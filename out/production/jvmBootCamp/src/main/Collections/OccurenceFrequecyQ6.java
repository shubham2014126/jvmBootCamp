public class OccurenceFrequecyQ6 {
    //input : [4,3,1,6,4,3,6,4]
    //output : [4,4,4,3,3,6,6,1]
    static int x = 0;
    public static void main(String[] args) {

        int a[] = {4, 3, 1,5, 6,5,4,3,6, 4,6};
        int b[][] = new int[a.length][2];
        a = sort(a);
        for (int i : a) {
            System.out.print(i + ",");
        }

        b[x][0]= a[0];
        for (int i=1;i<a.length;i++)
        {
            if (a[i]==a[i-1])
            {
                b[x][1]=b[x][1]+1;
            }
            else
            {
                x++;
                b[x][0]=a[i];
            }
        }
        x++;
        b = sort(b);
    }
    public static int[][] sort(int b[][])
    {
        int c[] = new int[2];
        for (int i=0;i<x;i++)
        {
            for (int j=i;j<x;j++)
            {
                if(b[i][1]<b[j][1])
                {
                    c = b[i];
                    b[i]=b[j];
                    b[j]=c;

                }
            }
        }
        return b;
    }
    public static int[] sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}