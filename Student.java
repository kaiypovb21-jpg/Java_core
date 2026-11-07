public class Student {
    public static void main(String[] args) {

        String name = "Бек";
        int age = 23;
        double height = 170.5;
        double weight = 68.5;
        boolean isStudent = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height + " см");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Студент: " + isStudent);

        System.out.println("byte:");
        System.out.println("Минимум: " + Byte.MIN_VALUE);
        System.out.println("Максимум: " + Byte.MAX_VALUE);

        System.out.println("\nshort:");
        System.out.println("Минимум: " + Short.MIN_VALUE);
        System.out.println("Максимум: " + Short.MAX_VALUE);

        System.out.println("\nint:");
        System.out.println("Минимум: " + Integer.MIN_VALUE);
        System.out.println("Максимум: " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("Минимум: " + Long.MIN_VALUE);
        System.out.println("Максимум: " + Long.MAX_VALUE);

        System.out.println("\nfloat:");
        System.out.println("Минимум: " + Float.MIN_VALUE);
        System.out.println("Максимум: " + Float.MAX_VALUE);

        System.out.println("\ndouble:");
        System.out.println("Минимум: " + Double.MIN_VALUE);
        System.out.println("Максимум: " + Double.MAX_VALUE);


    }
}