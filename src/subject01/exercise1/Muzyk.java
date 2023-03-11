package subject01.exercise1;

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

    public static Muzyk maxHonorarium(Muzyk[] muzycy) {
        var maxHonorarium = muzycy[0].czas * muzycy[0].stawka();
        var najdrozszyMuzyk = muzycy[0];

        for (var index = 1; index < muzycy.length; index++) {
            var honorarium = muzycy[index].czas * muzycy[index].stawka();

            if (honorarium > maxHonorarium) {
                maxHonorarium = honorarium;
                najdrozszyMuzyk = muzycy[index];
            }
        }

        return najdrozszyMuzyk;
    }
}
