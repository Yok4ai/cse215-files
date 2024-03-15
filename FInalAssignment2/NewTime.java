package FInalAssignment2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class NewTime implements Comparable<NewTime>, Cloneable{
    private int hour;
    private int minute;
    private int second;

    public NewTime(){
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+6"));
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        second = c.get(Calendar.SECOND);
    }

    public NewTime(String s){
        String[] arrOfStr = s.split(":", 3);
        if(Integer.parseInt(arrOfStr[0])<24 && Integer.parseInt(arrOfStr[0])>=0
        && Integer.parseInt(arrOfStr[1])<60 && Integer.parseInt(arrOfStr[1])>=0
        && Integer.parseInt(arrOfStr[2])<60 && Integer.parseInt(arrOfStr[2])>=0){
        hour = Integer.parseInt(arrOfStr[0]);
        minute = Integer.parseInt(arrOfStr[1]);
        second = Integer.parseInt(arrOfStr[2]);
        }
    }

    public NewTime(Calendar t){
        hour = t.get(Calendar.HOUR_OF_DAY);
        minute = t.get(Calendar.MINUTE);
        second = t.get(Calendar.SECOND);
    }

    public boolean setTime(int ss, int mm, int hh){
        if(ss<60 && mm<60 && hh<24 && ss>=0 && mm>=0 && hh>=0){
            second = ss;
            minute = mm;
            hour = hh;
            return true;
        }
        return false;
    }

    public NewTime getTime(){
        NewTime t1 = new NewTime();
        t1.hour = hour;
        t1.minute = minute;
        t1.second = second;
        return t1;
    }

    public int difference(NewTime t){
        int hourSeconds = ((hour-t.hour)*3600);
        int minuteSeconds = ((minute-t.minute)*60);
        int seconds = (second-t.second);

        return Math.abs(hourSeconds+minuteSeconds+seconds);
    }

    public int compareTo(NewTime t){
        if(hour == t.hour && minute == t.minute && second == t.second){
            return 0;
        }
        else if(hour > t.hour){
            return 1;
        }
        else if(hour == t.hour){
            if(minute > t.minute || (minute == t.minute && second > t.second)){
                return 1;
            }
            else{
                return -1;
            }
        }
        else
            return -1;
    }

    public Object clone(){
        NewTime c = new NewTime();
        c.hour = this.hour;
        c.minute = this.minute;
        c.second = this.second;
        return (Object) c;
    }

    @Override
    public String toString() {
        return "Time : hour=" + hour + " minute=" + minute + ", second=" + second;
    }
    public static void main(String[] args){

        NewTime x = new NewTime();
        NewTime y = new NewTime("11:3:50");

        Calendar gc = new GregorianCalendar();
        NewTime z = new NewTime(gc);

        System.out.println(x.setTime(60,60,24));
        System.out.println(z.setTime(55,2,11));

        System.out.println("Comparison: " + y.compareTo(z));
        System.out.println("Difference is " + y.difference(z)+" seconds");

        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());

        NewTime k = (NewTime) y.clone();
        System.out.println("Clone " + k);

        System.out.println(x.getTime());
        System.out.println(y.getTime());
        System.out.println(z.getTime());


    }
}

