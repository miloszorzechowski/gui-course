package subject02.exercise4;

import subject02.exercise3.Prostokat;

class Prostokat2 extends Prostokat implements Rysowanie {
    private final char symbol;

    Prostokat2(int x, int y, int width, int height, char symbol) {
        super(x, y, width, height);
        this.symbol = symbol;
    }

    @Override
    public void rysuj() {
        for (var row = 0; row < getHeight(); row++) {
            for (var column = 0; column < getWidth(); column++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}
