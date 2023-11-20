import java.util.Random;
import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number- the number of times to flip the coin: ");
        int numberOfFlips;

    numberOfFlips = Integer.parseInt(scanner.nextLine());

        int heads = 0;
        int tails = 0;
        Random random = new Random();

        for (int i = 0; i < numberOfFlips; i++) {
            
            double randomValue = random.nextDouble();
            if (randomValue < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        double headsPercentage = (double) heads / numberOfFlips * 100;
        double tailsPercentage = (double) tails / numberOfFlips * 100;
        scanner.close();
        System.out.println("Number of flips: " + numberOfFlips);
        System.out.println("Heads: " + heads + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tails + " (" + tailsPercentage + "%)");
    }
}
