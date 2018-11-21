package packageDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> l = new ArrayList<Integer>();
		int a[]= new int[6];
		System.out.println("give 6 numbers");
		Scanner input=new Scanner(System.in);
		for(int j=0;j<=5;j++) {
		int i=input.nextInt();
		a[j]=i;
//		l.add(i);
		}
//		System.out.println("the given input is " +a);
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
		}
		for (int i=0;i<a.length;i++) {
		System.out.println("the sorted array is " +a[i]);
		}
	}

}
