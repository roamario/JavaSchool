package homework.homework1;

public class task1 {
    public static void main(String[] args) {
        // Задача №1
        // На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
        int x = 5;
        int y = 10;
        System.out.print("Значени на входе: ");
        System.out.println("x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.print("Значени на выходе: ");
        System.out.println("x = " + x + " y = " + y);
    }
}