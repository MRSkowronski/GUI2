package Pierwsze;

/**
 * Created by Michal on 2015-03-11.
 */
public class Osoba {
    private String nazwisko;
    private int wiek;

    @Override
    public String toString(){
        return "Nazwisko: " + nazwisko + ", wiek: " + wiek;
    }
}
