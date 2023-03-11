package subject01;

class Wiolonczelista extends Muzyk {
    public Wiolonczelista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return "Wiolonczela";
    }

    @Override
    public double stawka() {
        return 250.0;
    }
}
