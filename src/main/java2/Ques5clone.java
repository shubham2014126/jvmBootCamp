
class Emp implements Cloneable
{
    int id;
    String name;
    public Emp(int id,String name)
    {
        this.id=id;
        this.name=name;

    }
     public  Object clone() throws CloneNotSupportedException
     {
         return super.clone();
     }
}

public class Ques5clone implements Cloneable {

public static void main(String[] args)
{
     try
     {
          Emp Employee=new Emp(47,"Shubham");
          Emp Employee2=(Emp)Employee.clone();
          System.out.println(Employee2.id+ "and"+Employee2.name);
     }
catch
(CloneNotSupportedException c)
{
    c.printStackTrace();
}
}


}
