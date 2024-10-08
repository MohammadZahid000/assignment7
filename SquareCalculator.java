package Assigment7;
import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its square: ");
        
        try {
            String input = scanner.nextLine();
            
            double number = Double.parseDouble(input);
            double square = number * number;
            System.out.println("The square of " + number + " is " + square);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close(); 
        }
    }
}



