package org.campus02.customerwiederholung;

public class DemoApp {

    public static void main(String[] args) {

        Customer c = new Customer(1);
        c.firstname = "Susi";
        c.lastname = "Sorglos";

        c.add(new Address("Grazerstraße 1", "Graz", "8010", "Country"));

        System.out.println(c.toString());

    }

}

