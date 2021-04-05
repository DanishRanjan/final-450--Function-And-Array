import java.io.*;
import java.util.*;

public class barChart{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    for(int floor=max;floor>=1;floor--){
        for(int i=0;i<n;i++){
            if(arr[i] >= floor){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}