import java.util.Scanner;
public class even{
public static void main(String[] args) {

int n,n1,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the start number:");

n=sc.nextInt();
System.out.println("Enter the last number:");
n1=sc.nextInt();
for(int i=n;i<=n1;i++)
{
    if(i%2==0)
{
System.out.println(i);
}
}
}
}