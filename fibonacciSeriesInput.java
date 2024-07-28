import java.util.Scanner;
public class fibonacciSeriesInput{
public static void main(String[] args) {

int a=0,b=1,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
b=sc.nextInt();
for(int i=1;i<=10;i++)
{
sum=a+b;
System.out.println(sum);
a=b;
b=sum;
}
}
}