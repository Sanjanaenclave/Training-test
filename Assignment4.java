package practice;

import java.util.Scanner;

public class Assignment4 {

	
	public static int [][] twoDimension = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	
	public static int x,y,num,finalValue1,finalValue2 = 0;
	
	public Assignment4(int first, int second)
	{
		this.finalValue1 = first;
		this.finalValue2 = second;
	}
	
	  public int getFirst() {
	        return finalValue1;
	    }

	    public int getSecond() {
	        return finalValue2;
	    }
	
	public static Assignment4 result(int level, int direction, int startnum)
	{
		 int m = 0,n = 0;
		Assignment4.x = level;
		Assignment4.y = direction;
		Assignment4.num = startnum;
		
		for (int i = 0; i < twoDimension.length; i++) {
			for (int j = 0; j < twoDimension[i].length; j++) {
				if(twoDimension[i][j]==num)
				{
					System.out.println("i:"+i +"j:"+j);
					m=i;
					n=j;
				}
			}
		}
		System.out.println("for loop after"+"i:"+m +"j:"+n);
		System.out.println("x:"+x +"y:"+y);
		
		if(x==1 && y==1)
		{
			m=m+1;
			System.out.print("inside"+"i:"+m);
			n++;
			System.out.print("inside"+"j:"+n);
		}
		else if(x==1 && y==2)
		{
			m++;
			n--;
		}
		else if(x==2 && y==1)
		{
			m = m+2;
			n++;
		}
		else if(x==2 && y==2)
		{
			m = m+2;
			n--;
		}
		System.out.println("after"+"i:"+m +"j:"+n);
		return new Assignment4(m, n);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the starting number");
		Scanner ss = new Scanner(System.in);
		int startNumber = ss.nextInt();
		System.out.println("Enter the depth upto which number can travel");
		int depth = ss.nextInt();
		System.out.println("Enter 1 for right direction movement and 2 for left direction movement");
		int direction = ss.nextInt();
		//Assignment4 ca = result(1, 1, startNumber);
		Assignment4 ca = result(depth, direction, startNumber);
		
		
		System.out.print(twoDimension[finalValue1][finalValue2]);
		

		
		
	}

}
