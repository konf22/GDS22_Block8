package org.campus02.customerwiederholung;

public class SpecialCustomer extends Customer {
    private String someAttribute;

    public SpecialCustomer(int customerNumber, String someAttribute) {
        super("System", "User", customerNumber);
        this.someAttribute = someAttribute;
    }
}
