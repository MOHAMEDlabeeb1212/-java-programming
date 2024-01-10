import java.util.Scanner;
public class comp {
    public static void main(String [] nandy)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values m and N");
        int m= s.nextInt();
        int n= s.nextInt();
        for(int i=m;i<=n;i++){
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isComposite(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
}
