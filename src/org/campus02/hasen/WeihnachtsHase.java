package org.campus02.hasen;

public class WeihnachtsHase extends Hase {

    public WeihnachtsHase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum");
    }
}
