public class Task1 {
    public static void main(String[] args) {
        //Сумма цифр трёхзначного числа
        int number = 472;
        int firstNumber = number / 100;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number % 10;
        int result = firstNumber + secondNumber + thirdNumber;

        System.out.println("1. Сумма цифр числа " + number + " = " + result);
        System.out.println("1 : " +firstNumber);
        System.out.println("2 : " +secondNumber);
        System.out.println("3 : " +thirdNumber);

        //Перевод секунд в часы, минуты и секунды
        int totalSeconds = 3725;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("2. Время: %02d:%02d:%02d%n",
                hours, minutes, seconds);

        // Неявное приведение типов
        int number1 = 10;       // Создаём целое число
        double number2 = number1; // Java сама переводит int в double
        System.out.println("Неявное приведение: " + number2);

        // Явное приведение типов
        double number3 = 9.99;  // Создаём дробное число
        int number4 = (int) number3; // Переводим double в int, дробная часть убирается
        System.out.println("Явное приведение: " + number4);

        // Использование Math.round
        double number5 = 9.99; // Создаём дробное число
        long number6 = Math.round(number5); // Округляем число до целого
        System.out.println("Math.round: " + number6);

        // Деление двух целых чисел
        int number7 = 5 / 2; // Получаем 2, потому что делим целые числа
        System.out.println("5 / 2 = " + number7);

        // Деление с дробным числом
        double number8 = 5 / 2.0; // Получаем 2.5, потому что одно число double
        System.out.println("5 / 2.0 = " + number8);
    }
}
