package subject02.exercise3;

public class Kolo extends Figura {
    private final int radius;

    public Kolo(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String nazwa() {
        return "Circle";
    }

    @Override
    public void pozycja(int x, int y) {
        if (Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2)) <= radius) {
            System.out.printf("Punkt (%d, %d) znajduje się wewnątrz koła%n", x, y);
        } else {
            System.out.printf("Punkt (%d, %d) znajduje się na zewnątrz koła%n", x, y);
        }
    }

    @Override
    public String toString() {
        return "Koło" + "\n" +
                "Środek - (" + getX() + ',' + getY() + ")" + "\n" +
                "Promień - " + radius + "\n";
    }

    @Override
    public double getArea() {
        return Math.pow(Math.PI * radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
