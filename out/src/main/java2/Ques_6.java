public class Ques_6
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        try
        {
            int x=arr[4];
            int y=arr[2]/0;
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("print by 1st catch");
        }
        catch (ArithmeticException e)
        {
            System.out.println("print by 2nd catch");
        }
        finally {
            int z=10/2;
            System.out.println(z);
            System.out.println("This will 100% execute");
        }
    }
}


