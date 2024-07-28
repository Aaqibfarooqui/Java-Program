// public class ReverseNumWhile{
//     public static void main(String[] args) {
//         int num = 12345;
//         int rev = 0;
//         while(num != 0){
//             rev = rev * 10 + num % 10;
//             num = num / 10;
//             }
//             System.out.println(rev);
//             }
            
// }
import java.util.Scanner;
public class ReverseNumWhile{
    public static void main(String[] args) {
        int n,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
 
    

    while(n>0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        // System.out.println(rev);
    }
    System.out.println("reverse is :"+rev);
    }

}