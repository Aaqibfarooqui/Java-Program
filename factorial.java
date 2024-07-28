
// public class factorial{
// public static void main(String[] args) {

// int a,sum=1;



// for(int i=1;i<=5;i++)
// {
// sum=sum*i;
// }
// System.out.println(sum);

// }
// }


import java.util.Scanner;
public class factorial{
public static void main(String[] args) {

int n,i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
System.out.println("Factorial is :"+fact);
}
}
}