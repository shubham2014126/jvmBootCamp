package Multithreading;
class PrintNum
{
    public synchronized void printPrime() throws InterruptedException
    {
        for(int i=2;i<=20;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Prime = "+ i);
                Thread.sleep(1000);
            }
            notify();
            wait();
        }
    }

    public synchronized void printNonPrime() throws InterruptedException
    {
        for(int i=3;i<=20;i++)
        {
            boolean isNonPrime=false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isNonPrime=true;
                    // break;
                }
            }
            if(isNonPrime)
            {
                System.out.println("Non Prime = "+i);
                Thread.sleep(1000);
            }
            notify();
            wait();
        }
    }
}


class PrimeNonPrime implements Runnable
{

    private PrintNum printNum;
    private boolean flag;

    public PrimeNonPrime(PrintNum printNum, boolean flag) {
        this.printNum = printNum;
        this.flag = flag;
    }

    @Override
    public void run()
    {
        try
        {
            if(flag)
            {
                printNum.printPrime();
            }
            else
            {
                printNum.printNonPrime();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}


public class PrimeNonPrimeQ2
{
    public static void main(String[] args)
    {
        System.out.println("Composite number = " + 1);
        PrintNum printNum=new PrintNum();
        PrimeNonPrime primeNonPrime=new PrimeNonPrime(printNum,true);
        PrimeNonPrime primeNonPrime1=new PrimeNonPrime(printNum,false);
        Thread thread=new Thread(primeNonPrime);
        Thread thread1=new Thread(primeNonPrime1);
        thread.start();
        thread1.start();
    }
}
