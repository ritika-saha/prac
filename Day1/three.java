public class three {

    public static void main(String[] args) {
 
        int N = Integer.parseInt(args[0]);

        
        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30");
            return;
        }

        
        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
