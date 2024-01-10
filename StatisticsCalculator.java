import java.util.*;

public class StatisticsCalculator{
    public int mean(int a[]){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum/a.length;
    }
    public int median(int a[]){
        int temp;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length/2];
    }
    public int mode(int a[]){
        int rep_count = 0;
        int m[] = new int[a.length];


        for(int i = 0;i<a.length;i++){rep_count = 0;for(int j = i+1;j<a.length;j++){if(a[i] == a[j] && a[i] != -1){a[j] = -1;rep_count+=1;}}m[i] = rep_count;}int mode_ind = 0;for(int i = 0;i<a.length;i++){if(m[i] >= m[mode_ind]){mode_ind = i;}}return a[mode_ind];}}