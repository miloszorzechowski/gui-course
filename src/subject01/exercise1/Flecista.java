package subject01.exercise1;

class Flecista extends Muzyk {
    public Flecista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return "Flet";
    }

    @Override
    public double stawka() {
        return 300.0;
    }
}
