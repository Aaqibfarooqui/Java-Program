import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        int n=100,i, j, flag;
        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter the number");
        //   n = sc.nextInt();
        for (i = 1; i <= 100; i++) {
            flag=0;
            for (j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }

                }
            }
//            if (flag == 0) {
//                System.out.println("prime");
//            } else {
//                System.out.println("not prime");
//            }
        }



