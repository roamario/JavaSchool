package homework.homework2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //        Задача 2:
        //        Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:
        //        a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите целое число a: ");
        int a = sc1.nextInt();
        System.out.print("Введите целое число b: ");
        int b = sc1.nextInt();
        System.out.println(Math.pow(a, 3) > Math.pow(b, 2));

    }



}
