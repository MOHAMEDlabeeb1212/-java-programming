import java.io.*;
import java.util.*;
public class labee{
    public static void main(String args[]){
        int a,b,c,d,i,j,k,l;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows for matrix1:");
        a=s.nextInt();
        System.out.println("Enter number of columns for matrix1:");
        b=s.nextInt();
        System.out.println("Enter number of rows for matrix2:");
        c=s.nextInt();
        System.out.println("Enter number of columns for matrix2:");
        d=s.nextInt();

        if(a==c && b==d){
            int p[][]=new int[a][b];
            int q[][]=new int[c][d];
            int r[][]=new int[c][d];

            System.out.println("Enter the Ele of m1:");
            for(i=0;i<a;i++){
                for(j=0;j<b;j++){
                    p[i][j]=s.nextInt();
                }
            }

            System.out.println("Enter the ele of m2:");
            for(i=0;i<c;i++){
                for(j=0;j<d;j++){
                    q[i][j]=s.nextInt();
                }
            }

            System.out.println("Final matrix: ");
            for(i=0;i<a;i++){
                for(j=0;j<b;j++){
                    for(k=0;k<c;k++){
                        for(l=0;l<d;l++){
                            if(i==k&&j==l){
                                r[i][j]=p[i][j]+q[k][l];
                            }
                        }
                    }
                }
            }
            for(i=0;i<a;i++){
                for(j=0;j<b;j++){
                    System.out.print(r[i][j]+" ");
                }
                System.out.print("\n");
            }


        }
        else{
            System.out.print("addition can't perform");
        }
    }
}