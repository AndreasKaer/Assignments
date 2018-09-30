
package liang_9_8;

public class Liang_9_8 {

    public static void main(String[] args) {
        // Creating a fan example
        Fan fanOne = new Fan();
        fanOne.setSpeed(Fan.FAST);
        fanOne.setRadius(7);
        fanOne.setColor("Red");
        fanOne.setON(true);  
        
        // Creating another fan example
        Fan fanTwo = new Fan();
        fanTwo.setSpeed(Fan.SLOW);
        fanTwo.setON(false);
        fanTwo.setRadius(12);
        fanTwo.setColor("Yellow");
        
        // Printing the toStriing values
        System.out.println("FanOne:  " + fanOne.toString());
        System.out.println("FanTwo:  " + fanTwo.toString());
        
    }
        
        
}
