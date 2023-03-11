package subject02;

class UFO implements Flyable, Speakable {
    @Override
    public String drive() {
        return "Unknown";
    }

    @Override
    public double distance() {
        return 999999999;
    }

    @Override
    public String speak() {
        return "Ziuuuuuuuuuuuum";
    }
}
