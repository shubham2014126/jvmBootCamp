public class Q11 {

    int getROI(){return 0;}
}
class SBI extends Q11{
    int getROI(){return 8;}
}

class ICICI extends Q11{
    int getROI(){return 7;}
}
class BOI extends Q11{
    int getROI(){return 9;}
}
class Test2{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        BOI a=new BOI();
        System.out.println("SBI ROI: "+s.getROI());
        System.out.println("ICICI ROI: "+i.getROI());
        System.out.println("BOI ROI: "+a.getROI());
    }


}
