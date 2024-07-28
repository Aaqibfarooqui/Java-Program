import java.util.Scanner;
class PatternEg{


//     static void printNumber(int n){
//         int i,j;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(j+" ");
//                 }
//                 System.out.println();
//                 }
                
//     }
//     public static void main(String[] args) {
//         printNumber(5);
//         }
        
// }





    static void printNumber(int n){
        int i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
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