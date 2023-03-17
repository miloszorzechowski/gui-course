package subject02.exercise1;

import subject02.exercise1.Figura;

public class Prostokat extends Figura {
    private int szerokosc;
    private int wysokosc;

    public Prostokat(int x, int y, int szerokosc, int wysokosc) {
        super(x, y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    protected int szerokosc() {
        return szerokosc;
    }

    protected int wysokosc() {
        return wysokosc;
    }

    @Override
    public String nazwa() {
        return "Prostokąt";
    }

    @Override
    public void pozycja(int x, int y) {
        String notification = String.format("Punkt (%d, %d) znajduje się result prostokąta", x, y);

        if ((x >= getX() & x <= getX() + szerokosc) & (y <= getY() & y >= y - wysokosc)) {
            notification = notification.replaceFirst("result", "wewnątrz");
        } else {
            notification = notification.replaceFirst("result", "na zewnątrz");
        }

        System.out.println(notification);
    }

    @Override
    public String toString() {
        return "Prostokąt" + "\n" +
                "Lewy górny - (" + getX() + ',' + getY() + ")" + "\n" +
                "Szerokość: " + szerokosc + ", Wysokość: " + wysokosc + "\n";
    }

    @Override
    public double pole() {
        return szerokosc * wysokosc;
    }

    @Override
    public double obwod() {
        return 2 * szerokosc + 2 * wysokosc;
    }
}
