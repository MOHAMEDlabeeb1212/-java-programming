public class factorial {
    public static void main(String [] args){
        int n=5;
        int fact=5;

        while(n!=1){
            fact=fact*(n-1);
            n=n-1;
        }
        System.out.println("The fact is "+ fact);
    }
}
