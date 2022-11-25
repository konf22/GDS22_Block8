package org.campus02.customerwiederholung;

import org.campus02.customerwiederholung.Address;

import java.util.ArrayList;

public class Customer extends Person {

    protected int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(String firstname, String lastname, int customerNumber) {
        super(firstname, lastname);
        this.customerNumber = customerNumber;
    }

    /*public Customer(int customerNumber, String firstname, String lastname) {

        super(firstname, lastname); // erster Befehl im Konstruktor
        this.customerNumber = customerNumber;

    }*/

    @Override
    public String print() {
        return customerNumber + ";" + super.print();
    }

    public void add(Address address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", firstname=" + getFirstname() +
                ", lastname=" + getLastname() +
                ", addresses=" + addresses +
                '}';
    }
}
