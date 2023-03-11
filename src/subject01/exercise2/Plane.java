package subject01.exercise2;

class Plane implements Flyable {
    @Override
    public String drive() {
        return "Aircraft engine";
    }

    @Override
    public double distance() {
        return 40212.14;
    }
}
