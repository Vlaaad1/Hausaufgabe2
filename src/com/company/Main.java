package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Erster Benutzer:");
    Basketball bb = new Basketball();
    Fussball f = new Fussball();
    Hindernislauf hi = new Hindernislauf();
    Hochsprung ho = new Hochsprung();
    ArrayList<Sport> s = new ArrayList<Sport>();
    s.add(bb);
    s.add(f);
    s.add(hi);
    s.add(ho);
	Benutzer b = new Benutzer("Lewis", "Hamilton", s);
    System.out.println("Allgemeine Zeit:");
    System.out.println(b.kalkuliereZeit());
    System.out.println("Basketball:");
    System.out.println(b.kalkuliereZeit(bb));
    System.out.println("Fussball:");
    System.out.println(b.kalkuliereZeit(f));
    System.out.println("Hindernislauf:");
    System.out.println(b.kalkuliereZeit(hi));
    System.out.println("Hochsprung:");
    System.out.println(b.kalkuliereZeit(ho));
    System.out.println("Durchschnittszeit:");
    System.out.println(b.kalkuliereZeitDurchschnittszeit());
        System.out.println();
        System.out.println("Anderer Benutzer:");
    Basketball bb1 = new Basketball();
    Basketball bb2 = new Basketball();
    Basketball bb3 = new Basketball();
    ArrayList<Sport> s2 = new ArrayList<Sport>();
    s2.add(bb1); s2.add(bb2); s2.add(bb3);
    Benutzer b2 = new Benutzer("Chris", "Hamilton", s2);
    System.out.println("Allgemeine Zeit:");
    System.out.println(b2.kalkuliereZeit());
    System.out.println("Basketball:");
    System.out.println(b2.kalkuliereZeit(bb2));
    System.out.println("Durchschnittszeit:");
    System.out.println(b2.kalkuliereZeitDurchschnittszeit());
    }
}
