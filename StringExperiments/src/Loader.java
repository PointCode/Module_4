
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 10 рублей, Петя - 7563 рубля, а Маша - 15 рублей";
       text = text.trim();
//ищем строку заработка Васи
        String str = "заработал ";

        int fistSym = text.indexOf(str) + str.length(); //длинна строки "заработал " - 10 символов
        int lastSym = text.indexOf(" ", fistSym);
        String firstSumStr  = text.substring(fistSym,lastSym);
        int firstSum = Integer.parseInt(firstSumStr);

//Ищем строку заработка Маши
        String str1 = "Маша - ";
        int fistSym1 = text.indexOf(str1) + str1.length(); //длинна строки "Маша - " 7
        int lastSym1 = text.indexOf(" ", fistSym1);
        String firstSumStr1  = text.substring(fistSym1,lastSym1);
        int firstSum1 = Integer.parseInt(firstSumStr1);


        System.out.println("Сумма доходов Васи и Маши ровна: " + (firstSum + firstSum1));

//------ Сколько зараотали все ребята
        String number[] = text.split("[^0-9]+");

        int vasia = Integer.parseInt(number[1]); // в нулевом индеске массива поустая строка почему не понятно.
        int petja = Integer.parseInt(number[2]);
        int masha = Integer.parseInt(number[3]);
        int summ = masha +petja+vasia;
        System.out.println("Сумма зараотных ребятами денег равна: "+ summ);

    }
}