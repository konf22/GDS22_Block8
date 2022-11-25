package org.campus02.customerwiederholung;

public class VerySpecialCustomer  extends  SpecialCustomer {

    public VerySpecialCustomer(String firstname, String lastname, int customerNumber, String someAttribute) {
        super(customerNumber, someAttribute);

        super.firstname = firstname; //this.firstname = firstname;
        super.lastname = lastname;

        super.customerNumber = 9;
    }


}
