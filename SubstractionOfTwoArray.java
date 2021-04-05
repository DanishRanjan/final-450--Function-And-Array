import java.io.*;
import java.util.*;

public class SubstractionOfTwoArray{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int[] arr1 = new int[n1];
	for(int i=0;i<n1;i++) {
		arr1[i] = sc.nextInt();
	}
	
	int n2 = sc.nextInt();
	int[] arr2 = new int[n2];
	for(int i=0;i<n2;i++) {
		arr2[i] = sc.nextInt();
	}
	
	int[] diff = new int[n2];
	int carry = 0;
	int i=arr1.length-1;
	int j = arr2.length-1;
	int k = diff.length-1;
	
	while(k>=0){
	    int digit = 0;
	    int arr1Value= i>=0? arr1[i]:0;
	     
	    if(arr2[j]+carry >= arr1Value){
	        digit  = arr2[j]+carry-arr1Value;
	        carry = 0;
	    }else{
	        digit = arr2[j]+carry +10 -arr1Value;
	        carry = -1;
	    }
	    diff[k] = digit;
	    i--;
	    j--;
	    k--; 
	}
	int idx = 0;
	 while(idx < diff.length){
	     if(diff[idx]==0){
	         idx++;
	     }else{
	         break;
	     }
	 }
	 while(idx < diff.length){
	  System.out.println(diff[idx]);
	  idx++;
	 }
 }

}