package packageDemo;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int i=input.nextInt();
		int q=1;
		
		while(i!=0) {
			
		String s= Integer.toString(i*q);
//		System.out.println(s);
		int j=s.length();
		int con=0;
		for(char c:s.toCharArray()) {
//			System.out.println(c);
			if(c=='1' || c=='0') {
//				System.out.println("this is the least multiple");
				con++;
				continue;
			}
			
			else {
				break;
			}
			
		}
		if(j==con) {
			System.out.println("least multiple "+i*q);
			break;
		}
		else {
			q++;
			continue;
		}
		}

	}

}
