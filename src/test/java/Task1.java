import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 7: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n > 7) {
                System.out.println("Привет");
            }

        }
    }
}
