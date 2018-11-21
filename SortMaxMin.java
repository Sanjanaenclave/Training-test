package new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {2,4,3,1,5,9,7,8,6};
		List<Integer> l=new ArrayList();
		for(int x:a) {
			l.add(x);
		}
		Collections.sort(l);
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i]=l.remove(l.size()-1);
			}
			else
				a[i]=l.remove(0);
		}
		for(int x:a) {
			System.out.println(x);
		}
		
	}
	}
