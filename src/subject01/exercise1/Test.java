package subject01.exercise1;

public class Test {

    public static void main(String[] args) {

        Muzyk[] muzycy = {new Skrzypek("Aleks", 2),    // Imie, czas wystapienia (w godz.)
                new Wiolonczelista("Bartek", 1),
                new Flecista("Czarek", 0.5)};
        for (Muzyk m : muzycy)
            System.out.println("Muzyk: " + m.imie() + '\n' +
                    "Instrument: " + m.instrument() + '\n' +
                    "Czas wystąpienia: " + m.czas() + " godz. " + '\n' +
                    "Stawka godzinowa: " + m.stawka() + '\n');

        System.out.println(Muzyk.maxHonorarium(muzycy));    // muzyk otrzymujący najwyższe honorarium za występ

    }
}
