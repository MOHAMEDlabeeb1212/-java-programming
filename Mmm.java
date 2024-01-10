import java.util.*;

public class Mmm{
    public static void main(String[] args){
        int i, sum=0,n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        n=s.nextInt();

        int a[]= new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();

        }

        for(i=0;i<n;i++){
            sum=sum+a[i];
        }

        System.out.println("Mean = "+sum/n);
        Arrays.sort(a);
        if(n%2==0){
            System.out.println("Median= "+a[(n/2)]);
        }
        else{
            System.out.println("Median= "+a[(n)/2]);
        }
    }
}