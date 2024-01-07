import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите операцию:");
        System.out.println("1.Вычитание");
        System.out.println("2.Сложение");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.println("5.Выход");
        Scanner scanner = new Scanner(System.in);
        int init = scanner.nextInt();
        int result;
        if (init == 5) {
            System.out.println("Выходим");
        } else if (init == 1) {
            System.out.println("Введите первое число:");
            int first = scanner.nextInt();
            System.out.println("Введите второе число:");
            int second = scanner.nextInt();
            System.out.println("a: " + first);
            System.out.println("b: " + second);
            System.out.println("Результат вычитания:");
            result = first - second;
            System.out.println("Ответ: " + result);
        } else if (init == 2) {
            System.out.println("Введите первое число:");
            int first = scanner.nextInt();
            System.out.println("Введите второе число:");
            int second = scanner.nextInt();
            System.out.println("a: " + first);
            System.out.println("b: " + second);
            System.out.println("Результат сложения:");
            result = first + second;
            System.out.println("Ответ: " + result);
        } else if (init == 3) {
            System.out.println("Введите первое число:");
            int first = scanner.nextInt();
            System.out.println("Введите второе число:");
            int second = scanner.nextInt();
            System.out.println("a: " + first);
            System.out.println("b: " + second);
            System.out.println("Результат умножения:");
            result = first * second;
            System.out.println("Ответ: " + result);
        } else if (init == 4) {
            System.out.println("Введите первое число:");
            int first = scanner.nextInt();
            System.out.println("Введите второе число:");
            int second = scanner.nextInt();
            System.out.println("a: " + first);
            System.out.println("b: " + second);
            System.out.println("Результат деления:");
            if (second == 0) {
                System.out.println("На ноль делить нельзя");
            }
            result = first / second;
            System.out.println("Ответ: " + result);
        }
        System.out.println("Программа завершена");
    }
}