
package oop_objekt_klasser;

public class OOP_Objekt_Klasser {

    public static void main(String[] args) {
        
        
        
        
        // Opgave 1
        Customer aCustomer = new Customer("Rob Johnson", 334567, 45.67); // Creating a variable with the name aCustomer of the type Customer and setting the attributes
        aCustomer.deposit(1000); // Depositing 1000 to aCustomer
        aCustomer.withdraw(450); // Withdrawing from aCustomer
        
        // Printiing the current balance of aCustomer
        System.out.println("The balance of customer: " + aCustomer.name + ". is: " + aCustomer.getBalance() + "££");
        
        
        // Opgave 2
        CustomerDatabase database = new CustomerDatabase();
        Customer cus1 = new Customer("Rob Nielsen", 1, 3.5);
        Customer cus2 = new Customer("Peter Hasen", 2, 400);
        Customer cus3 = new Customer("Mads Olsen", 3, 10);
        
        database.addCustomer(cus1);
        database.addCustomer(cus2);
        database.addCustomer(cus3);
        
        database.printCustomerNames();
    }
    
}
