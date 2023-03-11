package subject01;

abstract class Muzyk {
    private String imie;
    private double czas;

    protected Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }

    public String imie() {
        return imie;
    }

    public double czas() {
        return czas;
    }

    abstract protected String instrument();

    abstract protected double stawka();

    @Override
    public String toString() {
        return "Muzyk{" +
                "imie='" + imie + '\'' +
                ", czas=" + czas +
                '}';
    }

    public static Muzyk maxHonorarium(Muzyk[] muzycy)
    {
        double maxHonorarium = 0;
        Muzyk najdrozszyMuzyk = null;

        for (Muzyk muzyk : muzycy) {
            double honorarium = muzyk.czas * muzyk.stawka();

            if (honorarium > maxHonorarium) {
                maxHonorarium = honorarium;
                najdrozszyMuzyk = muzyk;
            }
        }

        return najdrozszyMuzyk;
    }
}
