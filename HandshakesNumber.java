package Trainingjava;
import java.util.*;

public class HandshakesNumber {
	public static int number;
	public static int handShakes(int num)
	{
		number = num*(num-1)/2;
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numebr of people in the room: ");
		int numberPeople = input.nextInt();
		
		HandshakesNumber.handShakes(numberPeople);
		System.out.println("Total number of handshakes is: "+ number);
	}

}
