import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loader {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите количество ящиков для перевозки конвоем:");

        int inBox = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        Convoy convoy = new Convoy();

        if (inBox != 0) {
            convoy.Carrying(inBox);
      }
      else System.out.println("Веденное количество ящиков не подлежит отправке");

    }
}