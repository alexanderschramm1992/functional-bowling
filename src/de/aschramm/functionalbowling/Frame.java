package de.aschramm.functionalbowling;

public sealed interface Frame permits Frame.NormalerFrame, Frame.ZehnterFrame {

    record NormalerFrame(Wurf wurf, NormalerFrame vorherigerFrame) implements Frame {}

    sealed interface ZehnterFrame extends Frame permits ZehnterFrame.OhneBonuswurf, ZehnterFrame.MitBonuswurf {

        record OhneBonuswurf(Wurf.Offen wurf, Frame.NormalerFrame vorherigerFrame) implements ZehnterFrame {}

        record MitBonuswurf(Wurf.Abraeumend wurf, Bonuswurf bonuswurf, Frame.NormalerFrame vorherigerFrame) implements ZehnterFrame {}
    }
}
