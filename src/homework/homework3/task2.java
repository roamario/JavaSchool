package homework.homework3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

//        Задача 2:
//        Написать программу, которая принимает строку с клавиатуры. Если строка == "Hi" - вывести в консоль "Hello", если Bye - Good bye,
//        если How are you - How are your doing. Если любая другая строка - вывести Unknown message. Сделать через:
//        1)   if-else
//        2)   switch-case
//                Примечание: для сравнения строк некорректно использовать оператор "==", почему - разберем позже. Можно воспользоваться методом equals().
//                Например: "Hi".equals(s); или s.equals("Hi");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры");
        String str = sc.nextLine();

        sc.close();

        if (str.equals("Hi")) {
            System.out.println("Hello");
        } else if (str.equals("Bye")) {
            System.out.println("Good bye");
        } else if (str.equals("How are you")) {
            System.out.println("How are your doing");
        } else System.out.println("Unknown message");


        switch (str) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
                break;
        }




    }
}
