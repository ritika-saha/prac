import java.util.Scanner;

public class nine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            char lowercaseCh = Character.toLowerCase(ch);

            if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' ||
                lowercaseCh == 'o' || lowercaseCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(" Please enter an alphabet.");
        }

        
        scanner.close();
    }
}
