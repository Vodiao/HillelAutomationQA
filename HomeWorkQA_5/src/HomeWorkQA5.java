
import java.util.Scanner;

public class HomeWorkQA5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Написать программу которая будет принимать из консоли 2 числа типа интеджер и символ операции типа чар.
         *
         * если пользователь ввел +, тогда num1+num2, то есть суммируем 2 числа, введенных пользователем.
         * если пользователь ввел -, тогда num1-num2, то есть из 1-го числа, введенного пользователем вычитаем 2-е число
         * и т.д.
         * должны быть операции: *,/,-,+,% первого числа от второга.
         *
         * создать отдельные методы для каждой операции
         *
         * Результат должен выводится на консоль
         */
        double result = 0;
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter operation symbol: ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                result = OperationsInTheCalculator.sum(num1, num2);
                break;
            case '-':
                result = OperationsInTheCalculator.minus(num1, num2);
                break;
            case '*':
                result = OperationsInTheCalculator.multiplication(num1,num2);

                break;
            case '/':
                if(num2 != 0){
                    result = OperationsInTheCalculator.division(num1,num2);
                } else {
                    System.out.println("Error");
                    System.exit(0);
                }
                break;
            case '%':
                if(num2 != 0){
                    result = OperationsInTheCalculator.division(num1,num2);
                } else {
                    System.out.println("Error");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error");
                System.exit(0);
                break;
        }
        System.out.println("Result: ");
        System.out.println(result);

    }


}