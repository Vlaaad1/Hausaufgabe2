package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Basketball bb = new Basketball();
    Fussball f = new Fussball();
    Hindernislauf hi = new Hindernislauf();
    Hochsprung ho = new Hochsprung();
    ArrayList<Sport> s = new ArrayList<Sport>();
    s.add(bb); s.add(f); s.add(hi); s.add(ho);
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
    System.out.println(b.kalkuliereZeitDurchsnittszeit());
    }
}
