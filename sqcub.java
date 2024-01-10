import java.util.Scanner;
public class sqcub {
    public static void main(String [] args){
        double in;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the decimal \n");
        in=s.nextDouble();
        double sq=in*in;
        double cub=in*in*in;
        System.out.println("Square = "+sq);
        System.out.println("cube = "+cub);
    }
}
