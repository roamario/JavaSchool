package homework.homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

//        Задача 1:
//        Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
//        c = b*a*(a + b)/(a2),         где a2 - a в квадрате
//        Совпадает ли результат выражения, если a и b — переменные типа int
//        (для проверки не забудьте также использовать подходящий метод Scanner)?

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        //double a = sc.nextDouble();
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        //double b = sc.nextDouble();
        int b = sc.nextInt();
        System.out.println(b*a*(a+b)/Math.pow(a, 2));
    }
}
