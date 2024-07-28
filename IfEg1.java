import java.util.Scanner;
class IfEg1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num = scan.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = scan.nextInt();
        if(num==num2){
            System.out.println("It is equals");
        }
        else{
            System.out.println("It is not equal");
        }
    
    }
    }