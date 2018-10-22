
package modul_13_opg;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Modul_13_opg {

    public static void main(String[] args) {
        
        File myFile = new File("F:\\SDU\\SEST\\NetBeans projekts\\Assignments\\twocolors.csv");
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(myFile);
            String input = "1,2,red,blue";
            Scanner s = new Scanner(input).useDelimiter(",");
            pw.println(s.nextInt());
            pw.println(s.nextInt());
            pw.println(s.next());
            pw.println(s.next());
            pw.close();

        } catch (Exception e) {
            System.out.println("There was an error writing to the file");
        }

        Scanner reader;
        try {
            reader = new Scanner(myFile);
            System.out.println(reader.nextLine());
            System.out.println(reader.nextLine());
            System.out.println(reader.nextLine());
            System.out.println(reader.nextLine());
            reader.close();
 
        } catch (Exception e) {
            System.out.println("Cannot find the file");
        }

        
    }
    
}
