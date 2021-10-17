package com.company;

import com.company.Sport;
import java.util.List;


public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sports;

    //Konstruktor

    public Benutzer(String vorName, String nachName, List<Sport> sports) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sports = sports;
    }

    //getter fur Vorname
    public String getVorName() {
        return vorName;
    }
    //getter fur Nachname
    public String getNachName() {
        return nachName;
    }
    //getter fur Sportliste
    public List<Sport> getSports() {
        return sports;
    }

    //setter fur Vorname
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }
    //setter fur Nachname
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
    //setter fut Sportliste
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    //diese Methode kalkuliert die allgemeine Zeit der allen Sports, der in die Liste sind
    public double kalkuliereZeit(){
        double sum=0;
        for (Sport aux: sports)
            sum = sum + aux.kalkuliereZeit();
        return sum;
    }

    //diese Methode kalkuliert die Zeit des Sports, den in die Liste ist
    public double kalkuliereZeit(Sport s){
        for (Sport aux: sports)
            if (aux == s)
                return aux.kalkuliereZeit();
        return -1;
    }

    //diese Methode kalkuliert die Durchschnittszeit der allen Sports, der in die Liste sind
    public double kalkuliereZeitDurchschnittszeit(){
        return kalkuliereZeit()/sports.size();
    }
}
