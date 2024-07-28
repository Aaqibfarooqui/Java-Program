import java.util.Scanner;
public class LoopDemo1{
public static void main(String[] args) {

int i,n,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
res=n*i;
System.out.println(n+"*"+i+"="+res);
}
}
}