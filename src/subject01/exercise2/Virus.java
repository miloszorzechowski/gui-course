package subject02;

class Virus implements Flyable, Speakable {
    @Override
    public String drive() {
        return "Engine";
    }

    @Override
    public double distance() {
        return 3000;
    }

    @Override
    public String speak() {
        return "Brrrr";
    }
}
