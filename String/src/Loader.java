/**
 * Created by papa on 15.12.15.
 */
public class Loader {
    public static void main(String[] args) {

//Вывод символов с 0 по 512
       for (int i = 0; i <= 512; i++) {
           char intCode = (char) i;
           System.out.println(intCode);
       }
        System.out.println();

        int e = 277;
        int e1 = 278;
        char intCode1 = (char) e;
        char intCode2 = (char) e1;
        System.out.println("Код русской буквы " +intCode1 + " = " + e);
        System.out.println("Код русской буквы " +intCode2 + " = " + e1);

        System.out.println();
//ищем русские символы
        char firstRuscod = 'А'; // 1040;
        char lastRuscod = 'я'; // 11033;

        int firstChcode = (int) firstRuscod;
        int lastChcode = (int) lastRuscod;

        System.out.println("Русские символы ");

        System.out.println("Первый " + firstChcode  +" - " + firstRuscod );
        System.out.println("Последний " + lastChcode + " - " +lastRuscod);
        System.out.println();
// Выводим русские символы и их код по UTF8
        System.out.println("Код - Символ");
        for (int i = 1040; i <= 1103; i++ )
        {
            char intCode = (char) i;

            System.out.println(i + "    " + intCode);
        }


    }
}
