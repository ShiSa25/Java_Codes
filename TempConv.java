import java.util.Scanner;

public class TempConv {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in Celcious:");
        int temp = in.nextInt();
        float temp1 = (temp * 9/5) + 32 ;
        System.out.println("The temp in Fahrenheit is: " + temp1);
        in.close();
    }
}
