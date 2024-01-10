import java.util.Scanner;
public class strrev {
    public static void main(String args[]){
        String a,b="";
        int d=0,i;
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the string: ");
            a=s.nextLine();
            d=a.length();

            for(i=d-1;i>=0;i--)
            {
                b=b+a.charAt(i);
            }
            System.out.println("The Reverse of the string is : "+b);
        }
        catch (Exception e){
            System.out.println("Enter only string");
        }
    }
}
