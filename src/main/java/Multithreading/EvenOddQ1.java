package Multithreading;

class Printer
{
    boolean isOdd=false;
    synchronized void printEven(int number)
    {
        while (isOdd==false)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Even" + number);
        isOdd=false;
        notifyAll();
    }

    synchronized void printOdd(int number)
    {
        while(isOdd==true)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Odd" + number);
        isOdd=true;
        notifyAll();
    }

}


class OddEven implements Runnable
{
    private Printer printer;
    private boolean isEven;

    public OddEven(Printer printer, boolean isEven) {
        this.printer = printer;
        this.isEven = isEven;
    }

    @Override
    public void run()
    {
        int number = isEven==true ? 2:1;
        while (number<=20)
        {
            if(isEven)
            {
                printer.printEven(number);
            }
            else
            {
                printer.printOdd(number);
            }
            number+=2;
        }
    }
}


public class EvenOddQ1
{
    public static void main(String[] args) {
        Printer printer =new Printer();
        Thread t1 =new Thread(new OddEven(printer,false));
        Thread t2 =new Thread(new OddEven(printer,true));
        t1.start();
        t2.start();
    }
}
