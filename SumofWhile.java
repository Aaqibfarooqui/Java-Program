import java.util.Scanner;

public class SumofWhile {


    public static void main(String[] args) {
        int n,rev=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        temp=n;



        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

            // System.out.println(rev);
        }

        if(rev==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}