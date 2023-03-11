package subject01.exercise2;

class Virus implements Flyable {
    @Override
    public String drive() {
        return "Air";
    }

    @Override
    public double distance() {
        return 0.182;
    }
}
