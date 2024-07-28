//basic program
//save java class always with classname where you have method main 
class basicExample { //start
//entry point of class
public static void main(String args[]){//start of main()
	//print statement
	System.out.println("Hii today is first lec");
	
	//variable
	String name="Aaqib Farooqui"; //declare & initialize
	System.out.println("My name :"+ name);

	int id=123;
	long phone = 870753143;
	double amt = 125.45;
	System.out.println(" Id :" + id + " phone number : " + phone + " Amount :" + amt);

}//end of main
//not possible to have multiple main() in a class
//public static void main(String args[]){}

}//end

//{} -- block of code
//() -- function/method
//[] -- size
 
//run
//javac basciExample.java
//java basicExample


//variable datatypes
//	|
//-----------------------------
//|		    	    |
//primitive	| 	non-primitive
//(fixed in size) |    (not fixed in size)
//short	boolean	|	string
//int	float	|	Class
//long	double	|	Object
//byte	char