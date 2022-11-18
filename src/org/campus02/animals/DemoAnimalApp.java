package org.campus02.animals;

public class DemoAnimalApp {
    public static void main(String[] args) {

        Beagle b = new Beagle("schokolade");
        b.eyeColor = "brown";
        b.weight = 4900;

        b.doSomething();
        System.out.println(b.eyeColor);
    }
}
