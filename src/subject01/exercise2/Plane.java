package subject02;

class Plane implements Flyable, Speakable {
    @Override
    public String drive() {
        return "Engine";
    }

    @Override
    public double distance() {
        return 40212.14;
    }

    @Override
    public String speak() {
        return "Whir";
    }
}
