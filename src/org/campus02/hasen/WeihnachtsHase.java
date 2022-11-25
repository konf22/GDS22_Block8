package org.campus02.hasen;

public class WeihnachtsHase extends Hase {

    public String bestFriend;

    public WeihnachtsHase(String name, String bestFriend) {
        super(name);
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "WeihnachtsHase{" +
                "bestFriend='" + bestFriend + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getBestFriend() {
        return bestFriend;
    }

    @Override
    public void verteilen() {
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum. "
                + bestFriend + " hilft beim Verteilen");
    }

    public void legeGeschenkeUntermChristbaum() {
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum. "
                + bestFriend + " hilft beim Verteilen");
    }
}
