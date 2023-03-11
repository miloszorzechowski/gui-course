package subject01.exercise2;

class Bird implements Flyable, Speakable {
    @Override
    public String drive() {
        return "Bird wings";
    }

    @Override
    public double distance() {
        return 12200;
    }

    @Override
    public String speak() {
        return "Chirp";
    }
}
