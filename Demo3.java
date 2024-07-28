import java.util.Scanner;
class Demo3
{
	public static void main(String args[])
	{
	
	Double a,b,c,avg;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First number :");
	a=sc.nextDouble();
	System.out.println("Enter the second number :");
	b=sc.nextDouble();
	System.out.println("Enter the Third number :");
	c=sc.nextDouble();
	avg=(a+b+c)/3;
	System.out.println("Average is :"+avg);
}}