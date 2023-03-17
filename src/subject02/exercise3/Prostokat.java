package subject02.exercise3;

public class Prostokat extends Figura {
    private final int width;
    private final int height;

    public Prostokat(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    protected int getWidth() {
        return width;
    }

    protected int getHeight() {
        return height;
    }

    @Override
    public String nazwa() {
        return "Rectangle";
    }

    @Override
    public void pozycja(int x, int y) {
        if (x >= getX() & x <= getX() + width & y <= getY() & y >= y - height) {
            System.out.printf("Punkt (%d, %d) znajduje się wewnątrz prostokąta", x, y);
        } else {
            System.out.printf("Punkt (%d, %d) znajduje się na zewnątrz prostokąta", x, y);
        }
    }

    @Override
    public String toString() {
        return "Prostokąt" + "\n" +
                "Lewy górny - (" + getX() + ',' + getY() + ")" + "\n" +
                "Szerokość: " + width + ", Wysokość: " + height + "\n";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }
}
