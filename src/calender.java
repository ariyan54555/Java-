import java.util.Calendar;

public class calander {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.YEAR));
    }
}
