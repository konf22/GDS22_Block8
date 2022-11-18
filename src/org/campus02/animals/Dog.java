package org.campus02.animals;

public class Dog {
    public String eyeColor;
    public int weight;

    public void doSomething() {
        System.out.println("wuff");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
