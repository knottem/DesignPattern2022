import java.util.Calendar;

public class testCalendarSingletonOrFactory {
    public static void main(String[] args) {
        var calendar = Calendar.getInstance();
        var calendar1 = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar1);
    }
}
