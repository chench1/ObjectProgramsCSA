/*
 Charles Chen
 9/23/21
 Calendar Program tells you Today’s date and its day of the week,
 The date 100 days from today and its day of the week
 Your birthday and the day of the week
 The date that is 10,000 days from your birthday
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarProgram {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        String weekdayNumbering = "1 is Sunday, 2 is Monday, 3 is Tuesday, 4 is Wednesday, 5 is Thursday, 6 is Friday, 7 is Saturday";
        System.out.println(weekdayNumbering);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Today's date is " + month + "/" + dayOfMonth + "/" + year + ". The day of the week is " + weekday);

        calendar.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("The date 100 days from now is " + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.YEAR) + ". The day of the week is " + calendar.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar birthday = new GregorianCalendar(2005, Calendar.AUGUST, 9);
        System.out.println("My birthday is on " + (birthday.get(Calendar.MONTH)+1) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" + birthday.get(Calendar.YEAR) + ". The day of the week is " + birthday.get(Calendar.DAY_OF_WEEK));

        birthday.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println("The date 10000 days from my birthday is " + (birthday.get(Calendar.MONTH) + 1) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" + birthday.get(Calendar.YEAR) + ". The day of the week is " + birthday.get(Calendar.DAY_OF_WEEK));
    }
}
