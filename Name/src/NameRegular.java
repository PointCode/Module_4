import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by papa on 24.01.2016.
 */
public class NameRegular {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите фамилию имя и отчество: ");

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        String[] words = str.split("[\\s*]");

        System.out.println("Фамилия: " + words[0]);
        System.out.println("Имя: " + words[1]);
        System.out.println("Отчество: " + words[2]);

    }
}
