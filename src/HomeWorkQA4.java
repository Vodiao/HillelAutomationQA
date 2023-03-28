import java.util.Arrays;


public class HomeWorkQA4 {
    public static void main(String[] args) {
        /**
         * создать массив типа int из 20 елементов.
         * вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
         * вывести в консоль все четные положительные числа.
         */
        array();
    }
    static void array() {
        int min = 0;
        int max = 50;
        int age = 0;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5 && array[i] <= 45)
            age = age + array[i];
        }
        System.out.println();
        System.out.println("The sum of all numbers greater than 5 and less than 45: " + age);
        System.out.println();
        System.out.print("All even positive numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}