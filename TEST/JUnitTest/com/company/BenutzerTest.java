package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class BenutzerTest {
    //test fur die erste Methode
    @Test
    void kalkuliereZeit() {
        Basketball basketball = new Basketball();
        Fussball fussball = new Fussball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(basketball);
        sports.add(fussball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        //erstellen einen neuen Benutzer
        Benutzer benutzer = new Benutzer("JJ","Addams", sports);

        assertEquals(170, benutzer.kalkuliereZeit());
    }

    //test fur die zweite Methode
    @Test
    void testKalkuliereZeit() {
        Basketball basketball = new Basketball();
        Fussball fussball = new Fussball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(basketball);
        sports.add(fussball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        //erstellen einen neuen Benutzer
        Benutzer benutzer = new Benutzer("John","Wick", sports);

        assertEquals(55, benutzer.kalkuliereZeit(basketball));
        assertEquals(65, benutzer.kalkuliereZeit(fussball));
        assertEquals(30, benutzer.kalkuliereZeit(hindernislauf));
        assertEquals(20, benutzer.kalkuliereZeit(hochsprung));

    }

    //test fur die dritte Methode
    @Test
    void kalkuliereZeitDurchsnittszeit() {
        Basketball basketball = new Basketball();
        Fussball fussball = new Fussball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(basketball);
        sports.add(fussball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        //erstellen einen neuen Benutzer
        Benutzer benutzer = new Benutzer("Johnny","Cage", sports);

        assertEquals((double)170/4, benutzer.kalkuliereZeitDurchsnittszeit());
    }
}