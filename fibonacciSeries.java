
public class fibonacciSeries{
public static void main(String[] args) {

int a=0,b=1,sum;

System.out.println(a);
System.out.println(b);

for(int i=1;i<=10;i++)
{
sum=a+b;
System.out.println(sum);
a=b;
b=sum;
}
}
}