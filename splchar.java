import java.util.Scanner;
public class splchar {
    public static void main(String [] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the line \n");
        String in= s.nextLine();
        int c=0;
        System.out.println("The spl char are \n");
        for(char ch: in.toCharArray())
        {
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
            {
                System.out.print(ch+" ");
                c++;
            }
        }
        System.out.println("\nThe number of spl char is "+ c);

    }
}
