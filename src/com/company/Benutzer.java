package com.company;
import java.util.List;
/**
 * @author Filip Vlad
 * Classname: Benutzer
 * Date: 19.10.2021
 * Benutzer Klasse hat ein Konstruktor, getters und setters und andere 3 Methoden
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sports;

    /**
     * Konstruktor der Klasse
     * */
    public Benutzer(String vorName, String nachName, List<Sport> sports) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sports = sports;
    }


    public String getVorName() {
        return vorName;
    }
    public String getNachName() { return nachName; }
    public List<Sport> getSports() {
        return sports;
    }
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    /**
     * @return kalkuliert die allgemeine Zeit der allen Sports,
     * der in die Liste sind
     */
    public double kalkuliereZeit(){
        double sum=0;
        for (Sport aux: sports) {
            sum = sum + aux.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * @param s ist ein Sport
     * @return  kalkuliert die Zeit des Sports, den in die Liste ist
    */
    public double kalkuliereZeit(Sport s){
        for (Sport aux: sports) {
            if (aux == s) {
                return aux.kalkuliereZeit();
            }
        }
        return -1;
    }

    /**
     *  diese Methode kalkuliert die Durchschnittszeit der allen Sports, der in die Liste sind
     */
    public double kalkuliereZeitDurchschnittszeit(){
        return kalkuliereZeit()/sports.size();
    }
}
