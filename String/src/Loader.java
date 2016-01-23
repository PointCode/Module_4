/**
 * Created by papa on 15.12.15.
 */
public class Loader {
    public static void main(String[] args) {

//Вывод символов с 0 по 512
       for (int i = 0; i <= 512; i++) {
           char intCode = (char) i;
           System.out.println(i + "    " + intCode);
       }
        System.out.println();

        int letterRus_e = 277;  //код ё
        int letterRus_E = 1025; // код Ё
        char intCode1 = (char) letterRus_e;
        char intCode2 = (char) letterRus_E;
        System.out.println("Код русской буквы " +intCode1 + " = " + letterRus_e);
        System.out.println("Код русской буквы " +intCode2 + " = " + letterRus_E);

        System.out.println();
//ищем русские символы
        char firstRuscode = 'А'; // 1040;
        char lastRuscode = 'я'; // 11033;

        int firstChcode = (int) firstRuscode;
        int lastChcode = (int) lastRuscode;

        System.out.println("Русские символы ");

        System.out.println("Первый " + firstChcode  +" - " + firstRuscode );
        System.out.println("Последний " + lastChcode + " - " +lastRuscode);
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
