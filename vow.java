import java.util.Scanner;
public class vow {
    public static void main(String [] args){
        String in,v="",c="";
        Scanner s= new Scanner(System.in);
        System.out.println("enter the String \n");
        in=s.next();
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)=='A'||in.charAt(i)=='E'||in.charAt(i)=='I'||in.charAt(i)=='O'||in.charAt(i)=='U'||in.charAt(i)=='a'||in.charAt(i)=='e'
            ||in.charAt(i)=='i'||in.charAt(i)=='o'||in.charAt(i)=='u'){
                v=v+in.charAt(i);
            }
            else{
                c=c+in.charAt(i);
            }
        }
        System.out.println("Vowel = "+v);
        System.out.println("Conosants = "+c);
    }
}
