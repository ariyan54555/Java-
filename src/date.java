import java.util.Date;

public class date {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
