public class EnglishText {
    public static void main(String[] args) {

String str = "The quality of implementation specifications concern two properties, " +
        "accuracy of the returned result and monotonicity of the method. Accuracy of the " +
        "floating-point Math methods is measured in terms of ulps, units in the last place. " +
        "For a given floating-point format, an ulp of a specific real number value is the distance " +
        "between the two floating-point values bracketing that numerical value. " +
        "When discussing the accuracy of a method as a whole rather than at a specific argument, " +
        "the number of ulps cited is for the worst-case error at any argument. If a method always " +
        "has an error less than 0.5 ulps, the method always returns the floating-point number " +
        "nearest the exact result; such a method is correctly rounded. A correctly rounded method is " +
        "generally the best a floating-point approximation can be; however, it is impractical for " +
        "many floating-point methods to be correctly rounded. Instead, for the Math class, a larger " +
        "error bound of 1 or 2 ulps is allowed for certain methods. Informally, with a 1 ulp error bound, " +
        "when the exact result is a representable number, the exact result should be returned as the " +
        "computed result; otherwise, either of the two floating-point values which bracket the exact " +
        "result may be returned.";
        //"Все почти правильно. К сожалению, Ваше решение выдаст и числа, если они будут в тексте. Прошу исправить"
        // цифр смысл текста теряется если его придется потом опять в строку преобразовавать.
//исправил
        //удаляем цифры  лишние пробелы с точками которые стояли рядом  с цифрами
        str= str.replaceAll("\\d."," ");
        str = str.replaceAll("[\\s]{2,}"," ");

        String[] words = str.split("[^a-zA-Z.,;]");//Удаляем всё символы кроме всех английских букв и знаков препинания. Знаки препинания не удаляются чтобы в выводе не было пустых строк и конкретно
       // отображались строки с десятичными цифрами.пинания не удалются чтобы в выдоде не было пустых строк и коретно отображалась строки с десятичными цифрами


        for (String word: words){

            System.out.println(word);
        }
    }
}
