package Project;

public class Factorial {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
        
        int n = Integer.parseInt(args[0]); // Read input from command-line args
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial of " + n + " is " + fact);
    }
}

