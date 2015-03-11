package Pierwsze.Drugie;

import Pierwsze.Osoba;

/**
 * Created by Michal on 2015-03-11.
 */
public class Rachunek {
    private Osoba wlasciciel;
    private double stanRachunku;

    public Rachunek(Osoba wlasciciel, double stanRachunku){
        this.wlasciciel = wlasciciel;
        this.stanRachunku = stanRachunku;
    }

    private boolean wplata (double money){
        stanRachunku += money;
    }


}
