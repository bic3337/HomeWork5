public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("");
        for (int a = 1; a < 11; a++) {
            System.out.println(a);

        }
        System.out.println("");
        for (int b = 10; b > 0; b--) {
            System.out.println(b);

        }
        System.out.println("");
        for (int c = 0; c <=17; c = c + 2) {
            System.out.println(c);

        }
        System.out.println("");
        for (int d = 1904; d < 2096; d = d + 4) {
            System.out.println(d + "г. Является высокосным годом");

        }
        System.out.println("");
        for (int e = 7; e < 100; e = e + 7) {
            System.out.println(e);

        }
        System.out.println("");
        for (int f = 1; f < 520; f = f * 2) {
            System.out.println(f);

        }
        System.out.println("");
        int salary = 29000;
        int total = 0;
        for (int g = 1; g < 13; g++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + g + " сумма накоплений " + total + " руб.");

        }
        System.out.println("");
        int numb = 2;
        for (int h = 1; h < 11; ++h) {
            System.out.printf(" %d * %d = %d", numb, h, numb * h);

        }
        System.out.println("");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
        System.out.println("");
        int salaryA = 29000;
        int totalA = 0;
        for (int f = 1; f <= 12; f++) {
            totalA = totalA + salaryA;
            System.out.println(" Месяц " + f + " сумма накоплений равна " + totalA + " руб.");


        }

    }
}

