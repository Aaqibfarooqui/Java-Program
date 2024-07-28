import java.util.Scanner;

public class TypeCastingEg {

        public static void main(String[] args){
            Scanner scann=new Scanner(System.in);
            System.out.println("Enter number : ");
            short number=scann.nextShort();
            System.out.println("Enter number : ");
            Long number1=scann.nextLong();

            System.out.println("Enter Number : ");
            double number1= scann.nextDouble();
            System.out.println("double datatype : " +number1);
            int num2=(int)number1;
            System.out.println("int datatype : "+ num2);
        }
    }

