import java.util.Scanner;
class IfEg{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your programming status haa/nahi : ");
        String ch = scan.next();

        if(ch.equalsIgnoreCase("haa")){
            System.out.println("You are a good programmer");
        }
        else{
            System.out.println("You are a bad programmer");
        }


    }
}