import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();

        if(n < 2) {
            System.out.println("Not Prime nor Composite");
            return;
        }

        boolean isPrime = true;
        for (int  i =2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;     
        }
    } 
    if(isPrime) {
        System.out.println("Prime");
    } else {
        System.out.println("Composite");
    }

    }
}
