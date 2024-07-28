import java.util.Scanner;
class NestedIfElseEg1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your programming status Present/Absent : ");
        String ch = scan.next();

        if(ch.equalsIgnoreCase("Present")){
            System.out.println("Enter Your score(1-99): ");
            double lang = scan.nextDouble();
            if(lang<=99 && lang>=80){
            System.out.println("Pass - o+");
            }
            else if(lang<80 && lang>=70){
            System.out.println("PASS - A+");
            }
            else if(lang<70 && lang>=60){
            System.out.println("Pass - A");
            }
            else if(lang<60 && lang>=50){
            System.out.println("Pass - B");
            }
            else if(lang<50 && lang>=40){
            System.out.println("Pass - C");
            }
            else if(lang<40 && lang>=30){
            System.out.println("Pass - D");
            }
            else if(lang<30 && lang>=1){
            System.out.println("Fail");
            }
            else{
                System.out.println("Invalid Score");
            }
        }
        else{
            System.out.println(" Fail - You are Absent");
        }


    }
}