import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the Harmonic Value (N): ");
        int N = scanner.nextInt();

        double harmonicNumber = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Number is: " + harmonicNumber);

        
        scanner.close();
    }
}

