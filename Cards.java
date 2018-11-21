package new1;

import java.util.LinkedList;
import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give the number: ");
		Scanner input =new Scanner(System.in);
		int i=input.nextInt();
		int ar[]=new int[i];
		for(int z:ar) {
			z=0;
			
		}
	
		int p=0;
		for(int j=1;j<=i;j++) {
			int m=0,n=0;
			while(m<=j) {
				if(ar[ (p+m+n)%i]==0)
				{
					if(m==j) 
					{
						ar[(p +m+n)%i]=j;
						m++;
					}
					else m++;
				}
				else n++;
			}
			p=(p+m+n)%i ;
		
		}
		
		for(int z:ar) {
			System.out.println(z);
		}
	}

}