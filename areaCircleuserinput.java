import java.util.Scanner;
class areaCircleuserinput
{
	public static void main(String args[])
	{
	
	Double area,r,total;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius :");
	r=sc.nextDouble();
	area=3.14;
	
	total=area*r*r;
	System.out.println("area is :"+total);
}}