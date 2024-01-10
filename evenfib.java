import java.util.*;
public class evenfib {
    public static void main(String args[])
    {
        int i,n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of terms \n");
        n=s.nextInt();
        int fib[]= new int[2*n+1];
        fib[0]=0;
        fib[1]=1;
        int sum=0;
        for(i=2;i<=2*n;i++){
            fib[i]=fib[i-1]+fib[i-2];
            if (i%2==0)
                sum+=fib[i];
        }
        System.out.printf("The sum of even fibonacii till %d is %d",n,sum);
    }
}
