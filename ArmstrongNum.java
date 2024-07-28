import java.util.Scanner;

public class ArmstrongNum {


    public static void main(String[] args) {
        int n,sum=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();


        temp=n;

        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;

            // System.out.println(rev);
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }

    }

}