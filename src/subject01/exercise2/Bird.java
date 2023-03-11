package subject02;

class Bird implements Flyable, Speakable {
    @Override
    public String drive() {
        return "Bird wings";
    }

    @Override
    public double distance() {
        return 1000;
    }

    @Override
    public String speak() {
        return "Whistle";
    }
}
