package Trainingjava;

import java.util.*;

public class OwnLogic {

	
	public static void customSort(List<Integer> m)
	{
		System.out.println(m);
		int size = m.size();
		do
		{
		for(int i=0;i<size-1;i++)
		{
			
				if(m.get(i)>(m.get(i+1)))
				{
					int temp1 = m.get(i+1);
					int temp2 = m.get(i);
					m.set(i, temp1);
					m.set(i+1, temp2);
		
					
				}
			
		}
		size=size-1;
		}while(size!=1);
		//System.out.println(m);
	}
	
	public static void sortResult(List<Integer> m)
	{
		for(int i=0;i<m.size();i++)
		{
			System.out.println(m.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new ArrayList<Integer>();
		ll.add(12);
		ll.add(5);
		ll.add(17);
		ll.add(9);
		
		OwnLogic.customSort(ll);
		OwnLogic.sortResult(ll);
		
		//Collections.sort(ll);
		
		
		
		
	}

}