package subject01.exercise1;

class Skrzypek extends Muzyk {
    public Skrzypek(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return "Skrzypce";
    }

    @Override
    public double stawka() {
        return 300.0;
    }
}
