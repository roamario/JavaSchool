import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
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