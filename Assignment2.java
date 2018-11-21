package packageDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> list3=new ArrayList<Integer>();
		ArrayList<Integer> list4=new ArrayList<Integer>();
		int a=0;
		int b=0;
		Scanner input=new Scanner(System.in);
		int y=input.nextInt();
		for(int i=1;i<=y;i++) {
			list.add(i);
			list2.add(i);
			
		}
		int x=list.size();
//		System.out.println(list.size());
		Collections.sort(list);
		Collections.reverse(list2);
//		System.out.println(list);
//		System.out.println(list2);
		
		for(int i=0;i<=x;i++) {
			if(x%2==0) {
				if(i<=x/2) {
			list3.add(list2.get(i));
			list3.add(list.get(i));
				}
			
			}
			
			else if(x%2==1) {
				if(i<=x/2) {
					list3.add(list2.get(i));
					list3.add(list.get(i));
					
				}
				
			}
			
		}
		for(int i=0;i<x;i++) {
			list4.add(list3.get(i));
		}
		System.out.println(list4); //[5, 1, 4, 2, 3]

	}

}
