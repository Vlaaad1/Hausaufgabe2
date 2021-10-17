package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class BenutzerTest {
    //test fur die erste Methode
    @Test
    void kalkuliereZeit() {
        /*
        Fall 1, wenn die Liste mehrere Objekte verschiedenen Klassen hat
        */
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

        /*
         Fall 2, wenn die Liste mehrere Objekte selben Klasse hat
        */
        Basketball bb1 = new Basketball();
        Basketball bb2 = new Basketball();
        Basketball bb3 = new Basketball();
        ArrayList<Sport> s2 = new ArrayList<Sport>();
        s2.add(bb1); s2.add(bb2); s2.add(bb3);
        //erstellen ein zweiter Benutzer
        Benutzer b2 = new Benutzer("Chris", "Evans", s2);
        assertEquals(165, b2.kalkuliereZeit());
    }

    //test fur die zweite Methode
    @Test
    void testKalkuliereZeit() {
        Basketball basketball = new Basketball();
        Fussball fussball = new Fussball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        Basketball basketball2 = new Basketball();
        Fussball fussball2 = new Fussball();
        Hindernislauf hindernislauf2 = new Hindernislauf();
        Hochsprung hochsprung2 = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(basketball);
        sports.add(fussball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        //erstellen einen neuen Benutzer
        Benutzer benutzer = new Benutzer("John","Wick", sports);
        /*
        Hier überprüft man, dass die Funktion die gesuchte Werte gibt, wenn der Sport in die Liste von Sports ist
        */
        assertEquals(55, benutzer.kalkuliereZeit(basketball));
        assertEquals(65, benutzer.kalkuliereZeit(fussball));
        assertEquals(30, benutzer.kalkuliereZeit(hindernislauf));
        assertEquals(20, benutzer.kalkuliereZeit(hochsprung));
        /*
        Hier überprüft man, dass die Funktion die Werte -1 gibt, wenn der Sport nicht in die Liste von Sports ist
        */
        assertEquals(-1, benutzer.kalkuliereZeit(basketball2));
        assertEquals(-1, benutzer.kalkuliereZeit(fussball2));
        assertEquals(-1, benutzer.kalkuliereZeit(hindernislauf2));
        assertEquals(-1, benutzer.kalkuliereZeit(hochsprung2));
    }

    //test fur die dritte Methode
    @Test
    void kalkuliereZeitDurchschnittszeit() {
        /*
        Fall 1, wenn die Liste mehrere Objekte verschiedenen Klassen hat
        */
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
        assertEquals((double)170/4, benutzer.kalkuliereZeitDurchschnittszeit());

        /*
         Fall 2, wenn die Liste mehrere Objekte selben Klasse hat
        */
        Basketball bb1 = new Basketball();
        Basketball bb2 = new Basketball();
        Basketball bb3 = new Basketball();
        ArrayList<Sport> s2 = new ArrayList<Sport>();
        s2.add(bb1); s2.add(bb2); s2.add(bb3);
        //erstellen ein zweiter Benutzer
        Benutzer b2 = new Benutzer("Johnny", "Evans", s2);
        assertEquals(55, b2.kalkuliereZeitDurchschnittszeit());
    }
}