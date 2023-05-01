import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int count = 0;
        int[] mas = new int[15];
        Random r = new Random();


        for (int i = 1; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
            System.out.print(mas[i] + " ");
            if (mas[i] > 0 && mas[i] % 3 == 0) {
                ++count;
            }
        }

        System.out.println(" ");
        System.out.println("Всего в массиве " + count + " чисел, кратных 3");
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                System.out.println(mas[i]);
            }
        }
    }
}

