package de.aschramm.functionalbowling;

public sealed interface Bonuswurf permits Bonuswurf.BonusOffen, Bonuswurf.BonusStrike {

    record BonusOffen(int wurf) implements Bonuswurf {}

    record BonusStrike() implements Bonuswurf {}
}
