package java2;

public class Ques4 {

    private static  Ques4 q4=new Ques4();

    private Ques4()
    {

    }
    public static Ques4 getQues4()
    {
        if(q4==null)
        {
            return  new Ques4();


        } else {
             return q4;
        }
    }


}
 class Singleton
 {
      public static void main(String[] args)
      {
          Ques4 q4a=Ques4.getQues4();
          Ques4 q4b=Ques4.getQues4();
          Ques4 q4c=Ques4.getQues4();
          if(q4a==q4b)
          {
              System.out.println("Equal Objects");
          }
      }
 }