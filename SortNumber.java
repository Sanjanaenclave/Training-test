package Trainingjava;

import java.io.*; 
import java.util.Arrays; 
   
public class SortNumber 
{ 
    // Function to print alternate sorted values 
    static void customSort(int arr[], int n) 
    { 
        Arrays.sort(arr);; 

        int i = 0, j = n-1; 
        while (i < j) { 
            System.out.print(arr[j--] + " "); 
            System.out.print(arr[i++] + " "); 
        } 
       
        if (n % 2 != 0) 
            System.out.print(arr[i]); 
    } 
 
    public static void main (String[] args) 
    { 
        int arr[] = {5, 1, 4, 2, 3}; 
        int n = arr.length; 
        
        customSort(arr, n); 
    } 
}