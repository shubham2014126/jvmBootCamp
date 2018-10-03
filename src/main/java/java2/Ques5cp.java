package java2;

public class Ques5cp {

    int a, b;

    public Ques5cp(int a, int b) {

        this.a = a;
        this.b = b;

    }

    Ques5cp(Ques5cp c) {

        a = c.a;
        b = c.b;
    }
}
 class Cp
 {
      public static void main(String[] args)
      {
          Ques5cp c=new Ques5cp(10,15);
          Ques5cp c1=new Ques5cp(c);
          System.out.println("Copied Values="+c1.a+"and"+c1.b);
}

}

