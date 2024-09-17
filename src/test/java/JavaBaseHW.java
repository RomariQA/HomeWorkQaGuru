public class JavaBaseHW {

    public static void main(String... args) {
        // переполнение
        byte a = 126;
        byte b = 127;

        System.out.println("a + b = " + (byte)(a+b));

        //вычисления комбинаций типов данных (int и double)
        int c = 10;
        double d = 1.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c > d = " + (c > d));
        }
    }
