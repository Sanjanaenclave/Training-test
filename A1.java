package JavaAssg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		int b[]= {22,34,10,25};
		for(int temp:b) {
			a.add(temp);
		}
		Collections.sort(a);
		System.out.println(a);
		
		

	}

}
