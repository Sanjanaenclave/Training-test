package practice;

import java.util.Scanner;

public class Puzzlecard 

{ public static void main(String[] args) 
{
	System.out.println("Enter the number upto which puzzle to be solved: ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	String arr[] = new String[num]; 
int pointer = 0; 
for (int value = 1; value <= arr.length; value++) 
	{ for (int x = 1; x <= value; x++) 
		{ if (pointer == arr.length - 1) 
			pointer = 0; 
		else 
			pointer++; //3
		if (arr[pointer] != null) 
		x--; 
	} 


arr[pointer] = value + ""; //1
while (arr[pointer] != null && value != arr.length)
	{ if (pointer == arr.length - 1) 
		pointer = 0; 
	else 
		pointer++; //2
	} 

	} 
System.out.println("Output of the puzzle is: ");
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+ "\t");
	
	}

 } 

}
