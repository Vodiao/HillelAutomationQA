import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Написать статический метод который будет добавлять переданный елемент в массив в определенную позицию.
         * С помощью перегрузки сделать параметр позиции опциональным.
         * Таким образом, если передается только массив и елемент,
         * то добавить его в начало, а если педается еще и позиция, то вставить елемент в указанную позицию,
         * а все последующие елементы сдвинуть.
         * Метод должен возвращать массив.
         */

        int[] array = {9, 9, 9, 9, 9, };
        int[] newArray = addingThePassedElement(array, 10,3);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] addingThePassedElement(int[] array, int elements) {
        int[] newArray = new int[array.length + 1];
        int counter = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i == 0) {
                newArray[i] = elements;
            } else {
                newArray[i] = array[counter];
                counter++;
            }
        }
        return newArray;
    }

    public static int[] addingThePassedElement(int[] array, int elements, int position) {
        int[] newArray = new int[array.length + 1];
        int counter = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = elements;
            } else {
                newArray[i] = array[counter];
                counter++;
            }
        }
        return newArray;
    }
}