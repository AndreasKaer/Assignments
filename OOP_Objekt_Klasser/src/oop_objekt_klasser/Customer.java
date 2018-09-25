
package oop_objekt_klasser;

public class Customer {
    // Adding attributes
    public String name;
    public int id;
    public double balance;
    
    // Creating constructor 1
    public Customer(String sName, int sID){
        name = sName;
        id = sID;
        balance = 0.0;
    }
    // Creating constructor 2
    public Customer(String sName, int sID, double sBalance){
        name = sName;
        id = sID;
        balance = sBalance; 
    }
    // Creating a method deposit that deposits a "amount" double to balance
    public void deposit(double amount){
        balance += amount;
    }
    // Creating a method withdraw that withdraws a "amount" double from the balance
    public void withdraw(double amount){
        if(balance >= amount){   // Hvis balance er større end amount så kan amount trækkes fra balance
            balance -= amount;
        }
    }
    // Creating method getBalance that returns a double af the value balance
    public double getBalance(){
        return balance;
    }
    
    
}
