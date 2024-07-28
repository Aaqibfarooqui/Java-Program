import java.util.Scanner;
public class cube{
public static void main(String[] args) {

int n,n1,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the start number:");

n=sc.nextInt();
System.out.println("Enter the last number:");
n1=sc.nextInt();
for(int i=n;i<=n1;i++)

   
{
    res=i*i*i;
System.out.println(res);
}
}

}


// public class cube{
// public static void main(String[] args) {

// int a=5,b=20,sum;

// System.out.println(a);
// System.out.println(b);

// for(int i=a;i<=b;i++)
// {
// sum=i*i*i;
// System.out.println(sum);

// }
// }
// }