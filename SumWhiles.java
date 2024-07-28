import java.util.Scanner;

public class SumWhiles {


    public static void main(String[] args) {
        double n, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextDouble();


        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;

            // System.out.println(rev);
        }
        System.out.println(sum);


    }

}