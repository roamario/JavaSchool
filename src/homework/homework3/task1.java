package homework.homework3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        Задача 1:
//        Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел(пр.1) если нет - частное(пр.2).
//        Также если числа равны - вывести надпись "Числа равны!"
//        пр1.: "Число1 * Число2 = Произведение", где число1 - значение 1го числа, число2 - значение 2го числа, Произведение - результат умножения.
//        пр2.: "Число1 / Число2 = Частное", где число1 - значение 1го числа, число2 - значение 2го числа, Частное - результат деления.
//                Помните, что результат деления двух целых чисел – тоже целое число.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();

        sc.close();

        if (a == b) {
            System.out.println("Числа a и b равны");
        }
        else if (a % 2 == 0) {
            System.out.println("a * b = " + a * b);
        }
        else {
            if (b == 0) System.out.println("Делить на ноль нельзя");
            else System.out.println("a / b = " + a / b);
        }
    }
}
