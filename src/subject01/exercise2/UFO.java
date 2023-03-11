package subject01.exercise2;

class UFO implements Flyable {
    @Override
    public String drive() {
        return "Unknown";
    }

    @Override
    public double distance() {
        return Integer.MAX_VALUE;
    }
}
