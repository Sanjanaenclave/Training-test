package new1;

import java.util.Scanner;

public class HandShakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of people in room :");
		int n=s.nextInt();
		System.out.println("number of unique Handshakes="+(n*(n-1)/2));

	}

}
