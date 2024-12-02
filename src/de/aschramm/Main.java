package de.aschramm;

import de.aschramm.functionalbowling.Frame;
import de.aschramm.functionalbowling.Spiel;
import de.aschramm.functionalbowling.Wurf;

public class Main {
    public static void main(String[] args) {
        final var beispiel = new Spiel(
                "Max Mustermann",
                new Frame.NormalerFrame(
                        new Wurf.Offen(4, 3),
                        new Frame.NormalerFrame(
                                new Wurf.Abraeumend.Spare(7),
                                null)));
        System.out.println("Hello world!");
    }
}