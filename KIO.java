public class KIO {
    public static void main(String [] args){
        int in=1;
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",in*in);
                in++;
            }
            System.out.println();
        }
    }
}
