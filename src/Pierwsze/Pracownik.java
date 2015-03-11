package Pierwsze;

/**
 * Created by Michal on 2015-03-11.
 */
public class Pracownik extends Osoba{
    private int staż;

    enum Stanowisko {

        Projektant(2000),    // Projektant ma pensję podstawową = 2000
        Programista(1500),
        Tester(1000);

        private double pensja;
        private double pensjaPodstawowa;
        private Stanowisko(double pensja) {
            this.pensja = pensja;
            //pensjaPodstawowa musi być w Stanowisku, bo enum nie wyłapuja spoza.
        }
        public double pobierzPensjePodstawowa() {
            return this.pensjaPodstawowa;
        }
    }

    public double obliczPensje(Stanowisko stanowisko){
        stanowisko.pensja = stanowisko.pensjaPodstawowa*staż/2;
        return stanowisko.pensja;
    }

    @Override
    public String toString(){
        return "niedokonczony toString w pracowniku!";
    }
}
