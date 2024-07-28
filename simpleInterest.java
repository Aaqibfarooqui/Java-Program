import java.util.Scanner;
class simpleInterest
{
	public static void main(String args[])
	{
	
	Double p,r,n,interest;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First number :");
	p=sc.nextDouble();
	System.out.println("Enter the second number :");
	r=sc.nextDouble();
	System.out.println("Enter the Third number :");
	n=sc.nextDouble();
	interest=(p*r*n)/100;
	System.out.println("Simple interest is :"+interest);
}}