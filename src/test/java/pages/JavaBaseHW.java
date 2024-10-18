package pages;

public class JavaBaseHW {

    public static void main(String... args) {
        // переполнение
        byte a = 126;
        byte b = 127;

        System.out.println("a + b = " + (byte)(a+b));

        //логические операторы
        System.out.println("щас мы подтвердим значения а и б - " + (a == 126 && b == 127));
        System.out.println("щас мы подтвердим значения что б не соответствует вводу- " + (a == 126 && b == 12));
        System.out.println("щас мы подтвердим что хоть одно из значения истина - " + (a == 126 || b == 22));


        //вычисления комбинаций типов данных (int и double)
        int c = 10;
        double d = 1.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c > d = " + (c > d));
        }
    }
