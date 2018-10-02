
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateQ8 {

    public static void main(String args[]) {
       Format fmt = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(fmt.format(new Date()));
    }

}
