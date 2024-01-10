import java.util.Scanner;
public class intrev
{
    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            int n,re=0,rem;
            System.out.print("enter the number");
            n=s.nextInt();
            while(n!=0)
            {
                rem=n%10;
                re=re*10+rem;
                n=n/10;
            }

            System.out.println("The reversed number is  "+re);
        }
        catch (Exception e)
        {
            System.out.println("Entter int");
        }
    }
}