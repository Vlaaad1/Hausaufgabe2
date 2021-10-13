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

    public double kalkuliereZeit(){
        double sum=0;
        for (Sport aux: sports)
            sum = sum + aux.kalkuliereZeit();
        return sum;
    }

    public double kalkuliereZeit(Sport s){
        for (Sport aux: sports)
            if (aux == s)
                return aux.kalkuliereZeit();
        return -1;
    }

    public double kalkuliereZeitDurchsnittszeit(){
        return kalkuliereZeit()/sports.size();
    }
}
