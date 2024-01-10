import java.util.*;

public class jn {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("List Size : ");
        int size = sc.nextInt();

        String names[],temp;
        names = new String[size];

        System.out.println("Enter " + size + " Names : ");
        for(int i = 0;i<size;i++){
            names[i] = sc.next();
        }

        System.out.println("Enter a Choice : \nA: Ascending Order \nD: Descending Order \n");
        String choice = sc.next();

        switch(choice){
            case "A":
                for(int i = 0 ;i<size;i++){
                    for(int j = i+1 ; j<size;j++){
                        if(names[i].compareTo(names[j]) > 0){
                            temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                System.out.println("Names in Ascending Order : ");
                for(int i = 0;i<size;i++){
                    System.out.println(names[i]);
                }
                break;

            case "D":
                for(int i = 0 ;i<size;i++){
                    for(int j = i+1 ; j<size;j++){
                        if(names[i].compareTo(names[j]) < 0){
                            temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                System.out.println("Names in Descending Order : ");
                for(int i = 0;i<size;i++){
                    System.out.println(names[i]);
                }
                break;

        }
    }
}
