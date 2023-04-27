import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /**
         * Написать метод который принимает строку . Разбить строку по словам убрав все разделители (пробелы, запятые, точки).
         * Сделать набор слов уникальным и вывести результат в консоль, привести первую букву каждого слова в заглавную.
         * Например меторд принял "масло, масло, колбаса, молоко". Вывод в консоль:
         *
         * Масло
         * Колбаса
         * Молоко
         */
        receivingString("butter, butter, sausage, milk.");
    }
    public static void receivingString (String str){
        String[] symbols = str.replace(",", "").replace(".","").split(" ");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(symbols));
        for (String word : set) {
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
        }
    }
}