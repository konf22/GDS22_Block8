package org.campus02.customer;

public class DemoCustomerApp {
    public static void main(String[] args) {

        Customer c = new Customer(1);
        c.addAddress(new Address("Körblergasse", "8010", "Graz", "Austria"));

        System.out.println(c.toString());

    }
}
