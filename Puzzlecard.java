package practice;

import java.util.Scanner;

public class Puzzlecard 

{ public static void main(String[] args) 
{
	System.out.println("Enter the number upto which puzzle to be solved: ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	String arr[] = new String[num]; 
	int y = 0; //pointer to point to index in array
for (int value = 1; value <= arr.length; value++) 
	{ for (int x = 1; x <= value; x++) 
		{ if (y == arr.length - 1) 
			y = 0; 
		else 
			y++; //3
		if (arr[y] != null) 
		x--; 
	} 


arr[y] = value + ""; //1
while (arr[y] != null && value != arr.length)
	{ if (y == arr.length - 1) 
		y = 0; 
	else 
		y++; //2
	} 

	} 
System.out.println("Output of the puzzle is: ");
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+ "\t");
	
	}

 } 

}
