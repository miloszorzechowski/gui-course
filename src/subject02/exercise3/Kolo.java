package subject02.exercise1;

import subject02.exercise1.Figura;

public class Kolo extends Figura {
    private int promien;

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    @Override
    public String nazwa() {
        return "Koło";
    }

    @Override
    public void pozycja(int x, int y) {
        double distance = Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
        String notification = String.format("Punkt (%d, %d) znajduje się result koła", x, y);

        if (distance <= promien) {
            notification = notification.replaceFirst("result", "wewnątrz");
        } else {
            notification = notification.replaceFirst("result", "na zewnątrz");
        }

        System.out.println(notification + "\n");
    }

    @Override
    public String toString() {
        return "Koło" + "\n" +
                "Środek - (" + getX() + ',' + getY() + ")" + "\n" +
                "Promień - " + promien + "\n";
    }

    @Override
    public double pole() {
        return Math.pow(Math.PI * promien, 2);
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * promien;
    }
}
