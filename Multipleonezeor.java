package newproject;
import java.util.LinkedList;
import java.util.Scanner;

public class Multipleonezeor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; int counter =1; int multiple,multiplezero =0; 
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter i :");
	    i = ss.nextInt();
	    LinkedList<Integer> stack = new LinkedList<Integer>();
	    
	    while(counter>0) {
	        multiple = i*(counter);
	        while(multiple>0)
	        {
	        	multiplezero = multiple % 10;
	        	if(multiplezero == 1 || multiplezero == 0)
	        	{
	        		multiple = multiple/10;
	        		stack.push(multiplezero);
	        		System.out.println("\n");
	        	}
	        	else
	        		break;
	        }
	        counter++;
	        }

	        
	        while (!stack.isEmpty()) {
	        	System.out.print(stack.pop());
	      }
	}

}
