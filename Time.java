import java.text.SimpleDateFormat;
import java.util.Date;
public class Time {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("HH.mm");
        Date dateobj = new Date();
        System.out.println("CURRENT:"+df.format(dateobj));
        String s=df.format(dateobj);
        Double i=Double.valueOf(s);  
        if(i>18.30)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }

}

 /*import java.time.format.DateTimeFormatter;  
    import java.time.LocalDateTime;    
    public class CurrentDateTimeExample1 {    
      public static void main(String[] args) {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
       LocalDateTime now = LocalDateTime.now();  
       System.out.println(dtf.format(now));  
       System.out.println(java.time.LocalTime.now());
      }    
    }*/    
    
    /*import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currentTime {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println( sdf.format(cal.getTime()) );
    }

}*/