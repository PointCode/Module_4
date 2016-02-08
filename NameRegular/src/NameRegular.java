import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameRegular {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите Фамилию Имя  Отчество: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.trim();

        String reg = "^([А-ЯЁ]{1}[а-яё]+)\\s+([А-ЯЁ]{1}[а-яё]+)\\s+([А-ЯЁ]{1}[а-яё]+)$"; //проверяме строку по русским буквам,  и через пробел
                                                                                                                                 // в трех элементах, Новый элемент начинася с заглавной


        boolean boolInputStringRegex = str.matches(reg);
    //    System.out.println(boolInputStringRegex);

// если веденные денные удовлетворяют уловияю заносим ФИО в массив и выводим
        if (boolInputStringRegex) {
            String[] words = str.split("[\\s*]");

            System.out.println("Фамилия: " + words[0]);
            System.out.println("Имя: " + words[1]);
            System.out.println("Отчество: " + words[2]);
        }else {
            System.out.println("Введиет ФИО в правильном формате: Фамилия Имя Отчество");
        }

    }
}
