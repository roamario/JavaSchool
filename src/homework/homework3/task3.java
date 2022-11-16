package homework.homework3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

//        Задача 3:
//        Завести три переменные типа String. С клавиатуры ввести в них вашу фамилию, имя и отчество. Вывести в консоль в одну строку ваше ФИО.
//        Сделать, используя:
//        1)   System.out.println
//        2)   System.out.printf
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String lastName = sc.nextLine();
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите отчество: ");
        String surName = sc.nextLine();

        sc.close();

        System.out.println(lastName + " " + name + " " + surName);
        System.out.printf("%s %s %s", lastName, name, surName);



    }
}
