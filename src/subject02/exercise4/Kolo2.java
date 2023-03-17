package subject02.exercise2;

import subject02.exercise1.Kolo;

class Kolo2 extends Kolo implements Transformacja {
    private int poprzednieX;
    private int poprzednieY;

    public Kolo2(int x, int y, int promien) {
        super(x, y, promien);
    }

    @Override
    public void przesunDo(int x, int y) {
        poprzednieX = getX();
        poprzednieY = getY();

        setX(x);
        setY(y);
    }

    @Override
    public void powrot() {
        setX(poprzednieX);
        setY(poprzednieY);
    }
}
