import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {
    public static void main(String[] args)  throws IOException {

        System.out.println("Введите фамилию имя и отчество: ");

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println();

// Ищем фамилию
        int firstSym = str.indexOf(" ", 0);
        String surName = str.substring(0,firstSym).trim();
        System.out.println("Фамилия: " + surName);

//Ищем Имя
        int secondSym = str.indexOf(" ", firstSym + 2);
        String firstName = str.substring(firstSym,secondSym).trim();
        System.out.println("Имя: " + firstName);

//Ищем Отчество
        int lastSym = str.length();
        int thirdSym = str.lastIndexOf(" ",lastSym);
        String middleName = str.substring(thirdSym,lastSym).trim();
        System.out.println("Отчество: " + middleName);
    }
}
