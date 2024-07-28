import java.util.Scanner;
class NestedIfEg{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your programming status haa/nahi : ");
        String ch = scan.next();

        if(ch.equalsIgnoreCase("haa")){
            System.out.println("Enter you know development lang or not status haa/nahi : ");
            
            String ch1 = scan.next();
            if(ch1.equalsIgnoreCase("haa")){
            System.out.println("know development");
            }
            else{
                System.out.println("dont know development");
            }
        }
        else{
            System.out.println("You are a bad programmer");
        }


    }
}