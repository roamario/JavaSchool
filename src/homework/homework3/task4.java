package homework.homework3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

/**
 * Ввести с клавиатуры два целых числа.
 * Если первое – четное ИЛИ второе – кратно трем,
 * вывести в консоль результат сравнения этих чисел.

 * Если первое число кратно и двум, и трем – вывести на экран число один,
 * возведенное в степень N, где N – второе число.
 * Для возведения в степень можно использовать Math.pow().
 * В случае, если результат выражения выходит за пределы типа int
 * (допустимые значения - [-2147483648; 2147483647]) –
 * вывести сообщение «Результат выражения слишком большой!»
 
 * Также максимальное и минимальное значение int содержится в константах
 * Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        sc.close();

        if ((a % 2 == 0) && (a % 3 == 0)) {
            double tmp = Math.pow(a, b);
            if (tmp >= Integer.MIN_VALUE && tmp <= Integer.MAX_VALUE) {
                System.out.printf("%d", (int)tmp);
            } else System.out.println("Результат выражения слишком большой!");
        } else if ((a % 2 == 0) || (b % 3 == 0)) {
            System.out.println(a == b);
        }
    }
}
