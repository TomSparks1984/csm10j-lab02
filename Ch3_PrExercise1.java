package csm10j.lab.pkg2;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
/**
 *
 * @author Tom Sparks
 */
public class CSM10JLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.FileNotFoundException {
        // TODO code application logic here
        Scanner inFile = new Scanner(new FileReader("inData.txt"));
        
        double length; 
        double width;
        
        double radius;
        
        String firstName;
        String lastName;
        int age;
        
        double savingsBalance;
        double interestRate;
        
        String upperCaseLetter; 
      
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        
        radius = inFile.nextDouble();
        
        firstName = inFile.next();
        lastName = inFile.next();
        age = inFile.nextInt(); 
        
        savingsBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();
        
        upperCaseLetter = inFile.next(); 
        char a = upperCaseLetter.charAt(0);
        int num = (int) (a);
        num++;
        char nextLetter = (char) (num);
        
        String outputStr = "Rectangle:\nLength = " + String.format("%.2f", length) + ", Width = " + width + 
                ", Area = " + String.format("%.2f", length * width) + ", Perimeter = " + 
                String.format("%.2f", 2 * length + 2 * width) + "\n\n" +
                
                "Circle:\nRadius = " + String.format("%.2f", radius + ", Area = " + String.format("%.2f", 3.1416 * radius * 
                radius) + ", Circumference = " + String.format("%.2f", 2 * 3.1416 * radius) + "\n\n" +
                
                "Name: = " + firstName + " " + lastName + ", Age = " + age + "\n" +
                "Beginning balance = $" + String.format("%.2f", savingsBalance) + 
                ", Interest rate = " + String.format("%.2f", interestRate) + ", \n" + 
                "Balance at the end of the month = $" + String.format("%.2f", 
                savingsBalance * interestRate / 100 / 12 + savingsBalance) + "\n\n" +
                
                "The character the comes after " + upperCaseLetter + " in the ASCII set is "
                + nextLetter + "\n\n";
                 
               
                
        PrintWriter outFile = new PrintWriter("outData.txt");
        
        outFile.println(outputStr);
        inFile.close();
        outFile.close();
        
    }
}
