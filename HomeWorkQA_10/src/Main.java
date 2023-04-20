public class Main {
    public static void main(String[] args) {
        /**
         * Написать enum Size который создержит 4 размера: SMALL, MEDIUM, LARGE и EXTRA_LARGE.
         * Size должен содержать конструктор принимающий 3 параметра: сокращенное название (S, M, XL etc.), числовое значение ширены, и длины.
         * Для каждого значения написать геттер
         * Переопределить метод toString() должен выводить например "S" or "SMALL" size: width=11 , length=40 .
         */
        SIZE size = SIZE.EXTRA_LARGE;
        System.out.println(size.toString());

    }

}