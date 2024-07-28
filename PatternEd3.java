import java.util.Scanner; //half pyramid
class PatternEd3{

    static void printNumber(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
                }
            for(j=1;j<=2*i-1;j++){
                System.out.print("$");
                }
                System.out.println();
                }
               
               
                for(i=n-1;i>=1;i--){
                    for(j=1;j<=n-i;j++){
                        System.out.print(" ");
                }

                for(j=1;j<=2*i-1;j++){
                    System.out.print("$");
                }
                System.out.println();
                }
                }
                
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        printNumber(n);
        }
        
}