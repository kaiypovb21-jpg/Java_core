import java.util.Scanner;
import java.time.Year;

public class Task3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            //Приветствие
            System.out.print("Введите ваше имя: ");
            String name = scanner.nextLine();

            System.out.print("Введите год рождения: ");
            int birthYear = scanner.nextInt();

            int age = Year.now().getValue() - birthYear;

            System.out.println("Привет, " + name + "!");
            System.out.println("Вам " + age + " лет.");




            //Оценка по баллам
            System.out.print("Введите количество баллов: ");

            if (scanner.hasNextInt()) {
                int points = scanner.nextInt();

                if (points < 0 || points > 100) {
                    System.out.println("Ошибка! Баллы должны быть от 0 до 100.");
                } else if (points < 50) {
                    System.out.println("Ваша оценка: 2");
                } else if (points < 70) {
                    System.out.println("Ваша оценка: 3");
                } else if (points < 90) {
                    System.out.println("Ваша оценка: 4");
                } else {
                    System.out.println("Ваша оценка: 5");
                }

            } else {
                System.out.println("Ошибка! Введите целое число.");
            }


            //Калькулятор
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0;

            if (operation == '+') {
                result = num1 + num2;
                System.out.println("Результат: " + result);

            } else if (operation == '-') {
                result = num1 - num2;
                System.out.println("Результат: " + result);

            } else if (operation == '*') {
                result = num1 * num2;
                System.out.println("Результат: " + result);

            } else if (operation == '/') {
                if (num2 == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя.");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }

            } else {
                System.out.println("Ошибка! Неизвестная операция.");
            }

        }
    }

