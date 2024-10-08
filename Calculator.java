package Assigment7;
class Calculator {
    private int num1;
    private int num2;

    
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public int Add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers must be positive for addition.");
        }
        return num1 + num2;
    }

    
    public int Subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers must be positive for subtraction.");
        }
        return num1 - num2;
    }

   
    public int Multiply() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Neither number can be zero for multiplication.");
        }
        return num1 * num2;
    }

   
    public double Division() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Neither number can be zero for division.");
        }
        return (double) num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
           
            Calculator obj1 = new Calculator(5, 10);
            Calculator obj2 = new Calculator(20, 15);
            Calculator obj3 = new Calculator(3, 7);
            Calculator obj4 = new Calculator(10, 2);

            
            System.out.println("Addition: " + obj1.Add());
            System.out.println("Subtraction: " + obj2.Subtract());
            System.out.println("Multiplication: " + obj3.Multiply());
            System.out.println("Division: " + obj4.Division());

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

