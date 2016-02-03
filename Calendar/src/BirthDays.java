import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BirthDays {
    public static void main(String[] args) {

    Calendar birthDay = Calendar.getInstance();
    Calendar toDay = Calendar.getInstance();
    birthDay.set(1969,01,01);                   // День Рождения
    toDay.set(2015,12,19);                      // устанволенная дата
    Date date = birthDay.getTime();

//---------расчет возраста и вывод его на кансоль-------
    long age = (toDay.getTimeInMillis() - birthDay.getTimeInMillis()) /1000/3600/24/365;
    System.out.println(age);

//---------устианвока фармата дат
    SimpleDateFormat fullBirthDay = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat weekDay = new SimpleDateFormat("EE", Locale.ENGLISH);

    int countAge = 0; // счетчи изменения возраста

    while(birthDay.getTimeInMillis() < toDay.getTimeInMillis() ) { // сравниаем дату дня раздения с установлелнной

        System.out.println(countAge + " " + fullBirthDay.format(date) + " - " + weekDay.format(date));
        birthDay.add(Calendar.YEAR, 1);
        date = birthDay.getTime();
        countAge++;
    }
  }
}
