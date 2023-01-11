package net.phoenix.rules.Utils;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {

    public static Date FromLong(Long time){
        Date date = new Date();
        date.setTime(time);
        return date;
    }
    public static Long DateToLong(Date date){
        if(date == null){
            return GetCurrent().getTime();
        }
        return date.getTime();
    }
    public static Date GetCurrent(){
        return Date.from(Instant.now());
    }
    public static Date AddDays(Date date, int days){

        if(date == null){
            return GetCurrent();
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.DAY_OF_MONTH, days);

        return cal.getTime();
    }

    /*
    * @return days from date1 to date2
    * */
    public static int DaysTo(Date date1, Date date2){

        if(date1 == null || date2 == null){
            return 0;
        }

        if(IsOver(date1, date2)){
            return 0;
        }

        long diffInMilliseconds = Math.abs(date1.getTime() - date2.getTime());
        return (int) TimeUnit.DAYS.convert(diffInMilliseconds, TimeUnit.MILLISECONDS);
    }

    /*
    * @return Is date1 bigger than date2
    * */
    public static boolean IsOver(Date date1, Date date2){
        if(date1 == null || date2 == null){
            return false;
        }
        return date1.getTime() >= date2.getTime();
    }
}
