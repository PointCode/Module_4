public class Loader {
    public static void main(String[] args) {

//Вывод символов с 0 по 512
       for (int i = 0; i <= 512; i++) {
           char intCode = (char) i;
           System.out.println(i + "    " + intCode);
       }
        System.out.println();



         char ch ='Ё';
         int iE = (int)ch;      //ch - char, код которого небходимо узнать
        String str = "0x"+(Integer.toString(iE,16)).toUpperCase();
        System.out.println(str +" " + iE);
        System.out.println();

        int codeLittleRusLetter = 277;  //код ё
        int codeLargeRusletter = 1025; // код Ё

        char littleRusLetter = (char) codeLittleRusLetter ;
        char largeRusletter = (char) codeLargeRusletter ;
        System.out.println("Код русской буквы " + littleRusLetter + " = " + codeLittleRusLetter );
        System.out.println("Код русской буквы " + largeRusletter + " = " + codeLargeRusletter);

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
