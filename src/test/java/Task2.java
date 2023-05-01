import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String name = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя: ");
        if (sc.hasNext()) {
            name = sc.next();
            System.out.println(name);
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);

        } else {
            System.out.println("Нет такого имени");
        }
    }
}