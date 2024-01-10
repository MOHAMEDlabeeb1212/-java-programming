import java.util.Scanner;
public class username {
    public static void main(String args[]) {
        String s1,s2;
        boolean result;
        Scanner s=new Scanner(System.in);
        s1=s.next();
        s2=s.next();
        result=s1.equals(s2);
        if(result==false){
            System.out.println("User ame is Invalid");
        }
        else{
            System.out.println("Username is valid");
        }
    }
}
