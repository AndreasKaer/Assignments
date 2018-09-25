package oop_objekt_klasser;

import com.sun.jndi.url.iiop.iiopURLContext;

public class CustomerDatabase {

    // Adding attributes
    Customer[] customers = new Customer[350];

    // Adding a constructor that takes no arguments
    public CustomerDatabase() {
    }

    // Adding a method that adds a customer
    public boolean addCustomer(Customer _customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = _customer;
                return false;
            }
        }
        System.out.println("There were an issue with adding a custoemr to the system");
        return true;
    }

    // Adding a method that removes a customer
    public boolean remoceCustomer(int sID) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].id == sID) {
                customers[i] = null;
                return false;

            }

        }
        System.out.println("There were an issue with removing the custoomer from the database");
        return true;
    }

    // Return the database array

    public Customer[] getCustomers() {
        return customers;
    }

    // Printing the name of the customers in the database

    public void printCustomerNames() {
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer.name);
            }

        }
    }

}
