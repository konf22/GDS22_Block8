package org.campus02.hasen;

public class DemoApp {

    public static void main(String[] args) {

        Hase hase = new Hase("Normaler Feldhase");

        hase.fressen();
        hase.verteilen();


        WeihnachtsHase santa = new WeihnachtsHase("Santa");
        santa.fressen();
        santa.schlafen();
        santa.verteilen();

        OsterHase felix = new OsterHase("Felix");
        felix.fressen();
        felix.schlafen();
        felix.verteilen();


    }
}
