package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Erster Benutzer:");
    Basketball basketball = new Basketball();
    Fussball f = new Fussball();
    Hindernislauf hi = new Hindernislauf();
    Hochsprung ho = new Hochsprung();
    ArrayList<Sport> s = new ArrayList<Sport>();
    s.add(basketball);
    s.add(f);
    s.add(hi);
    s.add(ho);
	Benutzer benutzer = new Benutzer("Lewis", "Hamilton", s);
    System.out.println("Allgemeine Zeit:");
    System.out.println(benutzer.kalkuliereZeit());
    System.out.println("Basketball:");
    System.out.println(benutzer.kalkuliereZeit(basketball));
    System.out.println("Fussball:");
    System.out.println(benutzer.kalkuliereZeit(f));
    System.out.println("Hindernislauf:");
    System.out.println(benutzer.kalkuliereZeit(hi));
    System.out.println("Hochsprung:");
    System.out.println(benutzer.kalkuliereZeit(ho));
    System.out.println("Durchschnittszeit:");
    System.out.println(benutzer.kalkuliereZeitDurchschnittszeit());
        System.out.println();
        System.out.println("Anderer Benutzer:");
    Basketball basketball1 = new Basketball();
    Basketball basketball2 = new Basketball();
    Basketball basketball3 = new Basketball();
    ArrayList<Sport> s2 = new ArrayList<Sport>();
    s2.add(basketball1); s2.add(basketball2); s2.add(basketball3);
    Benutzer benutzer2 = new Benutzer("Chris", "Hamilton", s2);
    System.out.println("Allgemeine Zeit:");
    System.out.println(benutzer2.kalkuliereZeit());
    System.out.println("Basketball:");
    System.out.println(benutzer2.kalkuliereZeit(basketball2));
    System.out.println("Durchschnittszeit:");
    System.out.println(benutzer2.kalkuliereZeitDurchschnittszeit());
    }
}
