import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Loader {
    public static void main(String[] args) {

    Calendar birthDay = Calendar.getInstance();
    Calendar today = Calendar.getInstance();
    birthDay.set(1969,01,01);
    today.set(2015,12,19);
    Date date = birthDay.getTime();
    long age = (today.getTimeInMillis() - birthDay.getTimeInMillis()) /1000/3600/24/365;
    System.out.println(age);

    SimpleDateFormat fullBirthDay = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat weekDay = new SimpleDateFormat("EE", Locale.ENGLISH);

    int i = 0;
    System.out.println(i + " " +fullBirthDay.format(date) + " - " + weekDay.format(date));
    while (i < age)
    {
        i++;
        birthDay.add(Calendar.YEAR,1);
        date = birthDay.getTime();
        System.out.println(i + " " +fullBirthDay.format(date) + " - " + weekDay.format(date));

    }
  }
}
