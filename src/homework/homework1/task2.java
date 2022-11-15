package homework.homework1;

public class task2 {
    public static void main(String[] args) {
        // Задача №2
        //        Используя
        //        a) Переменную типа String
        //        b) несколько переменных типа char
        //        c) одну переменную типа char
        //        вывести свое имя в консоль.
        //
        //        Вывод в консоль с переходом на новую строку:
        //        System.out.println(/*ваша переменная*/);
        //        Вывод в консоль без перехода на новую строку:
        //        System.out.print(/*ваша переменная*/);
        //
        //        Усложнение для внимательных: вывести ваше имя посимвольно, где каждая буква — на новой строке,
        //        не используя System.out.println(). Реализуется как с использованием String, так и используя char.

        String str = "Роман";
        char ch1 = 'Р';
        char ch2 = 'о';
        char ch3 = 'м';
        char ch4 = 'а';
        char ch5 = 'н';

        char ch6 = 1056;

        System.out.println(str + " - вывод с переходом на новую строку");
        System.out.print(str + " - вывод без перехода на новую строку\n");
        System.out.printf("Посимвольный вывод: %c%c%c%c%c\n", ch1, ch2, ch3, ch4, ch5);
        System.out.printf("Вывод посимвольно на каждой строке\n%c\n%c\n%c\n%c\n%c\n", ch1, ch2, ch3, ch4, ch5);
        System.out.printf("Вывод поимволлльно используя одну переменную: %c%c%c%c%c", ch6, ch6-2, ch6-4, ch6-16, ch6-3);
    }
}
