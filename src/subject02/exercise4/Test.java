package subject02.exercise4;

import subject02.exercise3.Figura;
import subject02.exercise3.Kolo;
import subject02.exercise3.Prostokat;

class Test {
    public static void main(String[] args) {
        testA();
        System.out.println();

        testB();
        System.out.println();

        testC();
    }

    private static void testA() {
        var figures = new Figura[] {new Kolo(10, 10, 5), new Prostokat(20, 20, 15, 10)};

        System.out.printf("%s area: %f%n", figures[0].nazwa(), figures[0].getArea());
        System.out.printf("%s circumference: %f%n", figures[0].nazwa(), figures[0].getCircumference());

        System.out.printf("%n%s area: %f%n", figures[1].nazwa(), figures[1].getArea());
        System.out.printf("%s circumference: %f%n", figures[1].nazwa(), figures[1].getCircumference());
    }

    private static void testB() {
        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');

        // p2 must be cast to another type that implements Rysowanie
        ((Prostokat2)p2).rysuj();
    }

    private static void testC() {
        Kolo2 k2 = new Kolo2(15, 20, 5);

        k2.przesunDo(50, 40);
        System.out.println(k2);

        k2.powrot();
        System.out.println(k2);
    }
}
