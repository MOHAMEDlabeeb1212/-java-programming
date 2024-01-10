import java.util.*;
public class interest {
    public static void main(String args[])
    {
        try
        {
            double p;
            int n;
            double in;
            char sen;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the principal amount: ");
            p=s.nextDouble();
            System.out.println("Enter the number of years:  ");
            n=s.nextInt();
            System.out.println("Is the customer senior Citizen (y/n)");
            sen=s.next().charAt(0);
            if (sen=='y')
            {
                in=p*n*0.12;
                System.out.println("The interest : "+in);
            }
            else {
                in=p*n*0.10;
                System.out.println("The interest : "+in);
            }
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
