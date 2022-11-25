package org.campus02.customerwiederholung;

public class DemoApp {

    public static void main(String[] args) {

        Customer c = new Customer("Susi", "Sorglos", 1);
//        c.setFirstname("Susi");
//        c.setLastname("Sorglos");

        c.add(new Address("Grazerstraße 1", "Graz", "8010", "Country"));
        
        String value = c.print();
        System.out.println("value = " + value);

        System.out.println(c.toString());

    }

}

