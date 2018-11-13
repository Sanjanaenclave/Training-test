package newproject;

import java.util.*;

public class SortList {

	
	public static void customSort(List<Integer> m)
	{
		System.out.println(m);
		for(int i=0;i<m.size();i++)
		{
			for(int j=0;j<m.size()-i-1;j++)
			{
				if(m.get(j)>m.get(j+1))
				{
					int temp = m.get(j);
					m.set(j, m.get(j+1));
					m.set(i+1, temp);
		
					
				}
			}
		}
		System.out.println(m);
	}
	
	public static void sortResult(List<Integer> m)
	{
		for(int i=0;i<m.size();i++)
		{
			//System.out.println(m.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new ArrayList<Integer>();
		ll.add(12);
		ll.add(5);
		ll.add(17);
		ll.add(9);
		
		SortList.customSort(ll);
		//SortList.sortResult(ll);
		
		
		
		
	}

}
