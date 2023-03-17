package subject02.exercise1;

import subject02.exercise2.Obliczenie;

public abstract class Figura implements Obliczenie {
    private int x;
    private int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract String nazwa();

    protected abstract void pozycja(int x, int y);

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
}
