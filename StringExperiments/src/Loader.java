public class Loader
{
    public static void main(String[] args){

     String text = "Выся заработал 20  рублей, Петя - 7563 рубля, а Маша - 20 рублей";
     text = text.trim();

//ищем строку заработка Васи
     String str = " ";                                                           // подстрока в строке  - пробел
     int numFirst = text.indexOf(str);                                    // поизиция превого вхождения подстрки str

     int fistSym = text.indexOf(str,numFirst+1) +str.length() ; //ищем второе вхождения подстрки str
     int lastSym = text.indexOf(str, fistSym);                        //ищем позицию слеющего вхождения подстрки str
     String firstSumStr  = text.substring(fistSym,lastSym);
     firstSumStr = firstSumStr.trim();                                   // удаляем пробелы
     int firstSum = Integer.parseInt(firstSumStr);

//Ищем строку заработка Маши

     int fistSym1 = text.lastIndexOf(str);                              //ищем последнее входение подстркии str
     int lastSym1 = text.lastIndexOf(str, fistSym1 -1);
     String firstSumStr1  = text.substring(lastSym1,fistSym1);
     firstSumStr1 = firstSumStr1.trim();
     int firstSum1 = Integer.parseInt(firstSumStr1);

     System.out.println("Сумма доходов Васи и Маши равна: " + (firstSum + firstSum1));

//------ Сколько заработали все ребята
        String number[] = text.split("[^0-9]+");

        int vasia = Integer.parseInt(number[1]);
        int petja = Integer.parseInt(number[2]);
        int masha = Integer.parseInt(number[3]);
        int summ = masha +petja+vasia;
        System.out.println("Сумма зараотных ребятами денег равна: "+ summ);

    }
}