import java.util.Calendar;
import java.util.TimeZone;

class calendar {
    public static void main(String[] args) {
        /*
         * Calendar c = Calendar.getInstance();
         * System.out.println(c.getCalendarType());
         * System.out.println(c.getTimeZone());
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
