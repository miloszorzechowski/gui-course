package subject02.exercise2;

import subject02.exercise1.Prostokat;

class Prostokat2 extends Prostokat implements Rysowanie {
    private char symbol;

    public Prostokat2(int x, int y, int szerokosc, int wysokosc, char symbol) {
        super(x, y, szerokosc, wysokosc);
        this.symbol = symbol;
    }

    @Override
    public void rysuj() {
        for (int row = 0; row < wysokosc(); row++) {
            for (int column = 0; column < szerokosc(); column++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}
