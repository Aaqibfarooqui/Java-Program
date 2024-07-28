import java.util.Scanner;
public class salary{
	public static void main(String args[])
	{
	
	Double BasicSal,HRA,DA,total;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary :");
	BasicSal=sc.nextDouble();
	System.out.println("Your salary is : "+BasicSal);
	HRA=(BasicSal*12)/100;
	System.out.println("HRA on your Salary is : "+HRA);
	DA=(BasicSal*10)/100;
	System.out.println("DA on your Salary is : "+DA);
	total=BasicSal+HRA+DA;
	System.out.println("Basic Salary is :"+total);
}}