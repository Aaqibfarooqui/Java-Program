import java.util.Scanner;
class NestedIfElseEg{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your programming status haa/nahi : ");
        String ch = scan.next();

        if(ch.equalsIgnoreCase("haa")){
            System.out.println("What lang you know development/designing/testing : ");
            String lang = scan.next();
            if(lang.equalsIgnoreCase("development")){
            System.out.println("know development & programming");
            }
            else if(lang.equalsIgnoreCase("designing")){
            System.out.println("know designing & programming");
            }
            else if(lang.equalsIgnoreCase("testing")){
            System.out.println("know Testing & programming");
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