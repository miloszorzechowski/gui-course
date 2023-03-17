package subject02.exercise4;

import subject02.exercise3.Kolo;

class Kolo2 extends Kolo implements Transformacja {
    private int previousX;
    private int previousY;

    Kolo2(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void przesunDo(int x, int y) {
        previousX = getX();
        setX(x);

        previousY = getY();
        setY(y);
    }

    @Override
    public void powrot() {
        setX(previousX);
        setY(previousY);
    }
}
