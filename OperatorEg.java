import java.util.Scanner;

public class OperatorEg {
    public static void main(String args[]){
        Scanner scann=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=scann.nextInt();
        System.out.println("Enter number : ");
        int number1=scann.nextInt();

        System.out.println(number+number1);
        System.out.println(number>number1);
        String s=(number<number1)?"right":"wrong";
        System.out.println(s);
        System.out.println(number++);
        System.out.println(number>number1&&number>number1);
        System.out.println(number+=number1);
    }
}
