import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by papa on 25.11.15.
 */
public class Loader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443",24166,"1963c8d6a3afe0d9a75e676bcae679dd");


        System.out.println("PLEASE ENTER YOUR PHONE:  ");
        String phone = reader.readLine().trim();

//// очищаем номер тлф от лишних символов
        phone = phone.replaceAll("[^0-9]+", "");

        AuthCheckedPhone authCheckedPhone = bridge.authCheckPhone(phone);

//проверяем зарегистрирован номер или нет, если зарегистрирован, то авторизуемся
        if (authCheckedPhone.isRegistered())
        {
            AuthSentCode authSentCode = bridge.authSendCode(phone);
            System.out.println(authSentCode);//выводим для отладки

            System.out.println("PLEASE ENTER SMS CODE: ");
            String smsCode = reader.readLine().trim();
             AuthAuthorization authorization =  bridge.authSignIn(smsCode);

            System.out.println("User name " + authorization.getUser());

        }
       else
       {
          System.out.println("Your phone number is not registered!");
        }
// разрываем соединение.
        bridge.authLogOut();
    }
}
