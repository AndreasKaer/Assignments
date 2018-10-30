
package grocerysystem;

// Opagve 1 modul 15

public class ExpiredProductAddedException extends Exception {
    // Exception that prints the message: Attempted to add expired product to the database
    public ExpiredProductAddedException(){
        super("Attedmpted to add expired product to the database");
    }
    // Writing the message
    public ExpiredProductAddedException(String message){
        super(message);
    }
}
