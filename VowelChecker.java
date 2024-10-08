package Assigment7;
class VowelChecker extends Exception {
    public VowelChecker(String message) {
        super(message);
    }
}

public class VowelChecker {
    public static void main(String[] args) {
        String input = "Sky"; 

        try {
            checkForVowels(input);
            System.out.println("The string contains vowels.");
        } catch (VowelChecker e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws VowelChecker {
       
        str = str.toLowerCase();
        
        
        if (!str.contains("a") && !str.contains("e") && !str.contains("i") &&
            !str.contains("o") && !str.contains("u")) {
            throw new VowelChecker("The string does not contain any vowels.");
        }
    }
}
