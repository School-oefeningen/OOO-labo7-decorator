package domain.launcher;

import domain.model.karakterTransformator.*;

public class Main {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        KarakterTransformatorInterface legeKarakterTransformator = new KarakterTransformator();
        KarakterTransformatorInterface hoofdletterElkWoord = new HoofdletterElkWoord(new KarakterTransformator());
        KarakterTransformatorInterface hoofdletterElkWoordSpatieNaElkeLetter = new SpatieAchterElkeLetter(new HoofdletterElkWoord(new KarakterTransformator()));
        KarakterTransformatorInterface hoofdletterElkWoordSpatieNaElkeLetterElkeSpatieVerwijderd = new ElkeSpatieVerwijderd(new SpatieAchterElkeLetter(new HoofdletterElkWoord(new KarakterTransformator())));
        KarakterTransformatorInterface elkeSpatieVerwijderdSpatieNaElkeLetterHoofdLetterElkWoord = new HoofdletterElkWoord(new SpatieAchterElkeLetter(new ElkeSpatieVerwijderd(new KarakterTransformator())));

        System.out.println("Lege karakter transformator:");
        System.out.println(legeKarakterTransformator.transformString(text) + "\n");

        System.out.println("Hoofdletter elk woord:");
        System.out.println(hoofdletterElkWoord.transformString(text) + "\n");

        System.out.println("Hoofdletter elk woord en spatie na elke letter:");
        System.out.println(hoofdletterElkWoordSpatieNaElkeLetter.transformString(text) + "\n");

        System.out.println("Hoofdletter elk woord, spatie na elke letter en elke spatie verwijderd:");
        System.out.println(hoofdletterElkWoordSpatieNaElkeLetterElkeSpatieVerwijderd.transformString(text) + "\n");

        System.out.println("Elke spatie verwijderd, spatie na elke letter en hoofdletter elke woord:");
        System.out.println(elkeSpatieVerwijderdSpatieNaElkeLetterHoofdLetterElkWoord.transformString(text) + "\n");
    }
}
