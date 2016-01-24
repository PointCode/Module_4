/**
 * Created by papa on 15.12.15.
 */
public class Numeric {
    public static void main(String[] args) {
        int a = 1660/100;
        double d = 24.0 * 0.1;

        Short maxS = Short.MAX_VALUE;
        Short minS = Short.MIN_VALUE;

        Long maxL = Long.MAX_VALUE;
        Long minL = Long.MIN_VALUE;

        Float maxF = Float.MAX_VALUE;
        Float minF = Float.MIN_VALUE;

        Double maxD = Double.MAX_VALUE;
        Double minD = Double.MIN_VALUE;

        System.out.println("Вывод значения перменной 'а' ип int " + a);
        System.out.println("Вывод значения перменной 'b' ип int " + d);              // 24.0*0.1 = 2.4000000000000004 - последняя занчащая цифра после запятой - 4, а не - 0.
                                                                                     // Это связанно с предавлением форма типа Duble, представлением его точности или нет?
        System.out.println("Произведение 'a' * 'b' равно " +(24.0f * 0.1));          // однако.
        System.out.println();

        System.out.println("Максимальное занчение типа SHORT " + maxS);
        System.out.println("Минимальное занчение типа SHORT " + minS);
        System.out.println();

        System.out.println("Максимальное занчение типа LONG " + maxL);
        System.out.println("Минимальное занчение типа LONG " + minL);
        System.out.println();

        System.out.println("Максимальное занчение типа FLOAD " + maxF);
        System.out.println("Миниманильное занчение типа FLOAD " + minF);
        System.out.println();

        System.out.println("Максимальное занчение типа DOUBLE " + maxD);
        System.out.println("Минимальное занчение типа DOUBLE " + minD);

    }
}
