public class Ques3 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        S s = new S();
        s.hello();
    }
}
    class S
 {
     void hello()
     {
         System.out.println("Hey");
     }
 }

