package subject02.exercise2;

import subject02.exercise1.Figura;
import subject02.exercise1.Kolo;
import subject02.exercise1.Prostokat;

class Test {
    private static void testA() {
        var circle = new Kolo(10, 10, 5);
        var rectangle = new Prostokat(20, 20, 15, 10);

        System.out.printf("Pole koła wynosi %f%n", circle.pole());
        System.out.printf("Pole prostokąta wynosi %f%n", rectangle.pole());

        System.out.printf("Obwód koła wynosi %f%n", circle.obwod());
        System.out.printf("Obwód prostokąta wynosi %f%n", rectangle.obwod());
    }

    private static void testB() {
        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');       // prostokąt rozmiaru 10 x 5 będzie "rysowany" na konsoli za pomocą znaku '*'
        ((Prostokat2)p2).rysuj();                                          // Wyjaśnić dlaczego p2.rysuj() nie działa?
    }

    private static void testC() {
        Kolo2 k2 = new Kolo2(15, 20, 5);

        k2.przesunDo(50, 40);    // przesunięcie środka koła do punktu (50, 40)
        System.out.println(k2);

        k2.powrot();                    // powrót do poprzedniej pozycji (bezpośrednio przed przesunięciem) środka koła
        System.out.println(k2);
    }
}
