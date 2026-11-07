public class Card {
    public static void main(String[] args) {

        int number = Integer.MAX_VALUE;

        System.out.println("Максимальное значение int: " + number);
        number = number + 1;
        System.out.println("После прибавления 1: " + number);
        int a = 10;
        int b = 20;

        System.out.println("До обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("После обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}