import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);  
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("The sum is " + sum  );
        scanner.close();
        
    }
}
