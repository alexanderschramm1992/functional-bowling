package de.aschramm.functionalbowling;

public sealed interface Wurf permits Wurf.Offen, Wurf.Abraeumend {

    record Offen(int ersterWurf, int zweiterWurf) implements Wurf {}

    sealed interface Abraeumend extends Wurf permits Abraeumend.Spare, Abraeumend.Strike {

        record Spare(int ersterWurf) implements Abraeumend {}

        record Strike() implements Abraeumend {}
    }
}
