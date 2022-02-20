package tests;

public class Java {
    public static void main(String[] args) {


        int a = 10,
            b = 20,
            c = 25,
            d = 25;
        boolean t = true,
                f = false;
        byte bt = 127;
        long l = 30_000_000_000L;
        float n=1.75F;
        double db=5.75;
        char fn='T', ln='M';
        String aString = "Пройден";

        System.out.println("a+b =" + (a + b));
        System.out.println("a-b =" + (a - b));
        System.out.println("a*b =" + (a * b));
        System.out.println("db/n =" + (db / n));
        System.out.println("db%n =" + (db % n));
        System.out.println("a++ =" + (a++));
        System.out.println("b-- =" + (b--));
        System.out.println("d++ =" + (d++));
        System.out.println("++d =" + (++d));
        System.out.println("d++ =" + (d++));
        System.out.println("--d =" + (--d));
        System.out.println("int + long =" + (c + l));
        System.out.println("a==b =" + (a == b));
        System.out.println("a !=b =" + (a != b));
        System.out.println("a > b =" + (a > b));
        System.out.println("a >= b =" + (a >= b));
        System.out.println("a < b =" + (a < b));
        System.out.println("a <= b =" + (a <= b));
        System.out.println("b <= a" + (b <= a));
        System.out.println("b >= a" + (b >= a));
        System.out.println("t $$ f=" + (t && f));
        System.out.println("t || f=" + (t || f));
        System.out.println("!(t $$ f)=" + !(t && f));
        System.out.println("Переполнение типа byte " + (bt + 1) + " " + (bt - 300));
        System.out.println(fn+ln);
        System.out.println(aString);


    }
}
