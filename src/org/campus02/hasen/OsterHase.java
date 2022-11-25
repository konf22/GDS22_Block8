package org.campus02.hasen;

public class OsterHase extends Hase{

    public OsterHase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " verteilt Geschenke und Ostereier in der Wiese");
    }

}
