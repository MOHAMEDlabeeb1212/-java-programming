import java.util.*;
public class skip {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of M \n");
        int m=s.nextInt();
        System.out.println("Enter the value of N \n");
        int n=s.nextInt();
        System.out.println("Enter the value of K \n");
        int k=s.nextInt();
        while(m<=n){

            System.out.println(m);
            m=m+k+1;

        }
    }
}
