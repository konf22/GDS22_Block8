package org.campus02.hasen;

public class DemoApp {

    public static void main(String[] args) {

        Hase hase = new Hase("Normaler Feldhase");

        hase.fressen();
        hase.verteilen();


        WeihnachtsHase santa = new WeihnachtsHase("Santa", "Mutter");
        santa.fressen();
        santa.schlafen();
        santa.verteilen();

        OsterHase felix = new OsterHase("Felix");
        felix.fressen();
        felix.schlafen();
        felix.verteilen();

        System.out.println("------");

        Object o = santa;
        Hase h1 = santa;
        System.out.println("h1.verteilen");
        h1.verteilen();
        System.out.println(o.toString());

        System.out.println(santa.getBestFriend());
        h1.verteilen();

        Hasenstall hoppelWiese = new Hasenstall();
        hoppelWiese.add(hase);
        hoppelWiese.add(santa);
        hoppelWiese.add(felix);

        System.out.println("--- verteilen von Hoppelwiese ---");
        hoppelWiese.verteilen();

        hoppelWiese.fuettern();

    }
}
