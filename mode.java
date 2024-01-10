import java.lang.reflect.Array;
import java.util.Arrays;

public class mode {
    public static void main(String [] args){
        int a[]= {1,2,3,4,5,2};
        int freq[]={0,0,0,0,0,0};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    freq[i]+=1;
                }
            }
        }

    }
}
