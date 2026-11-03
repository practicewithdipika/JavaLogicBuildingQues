package JavaLogicBuildingQues;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesElementsinArray {

	public static void main(String[] args) {
		int a[]= {2, 7, 8, 4, 2, 8, 3, 5, 1, 4};
		
		if(a.length==0) {
			System.out.println("Length of the String is zero");
		}
		else {
			
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			for(Integer i: a) { //1
				if(mp.containsKey(i)) {
					mp.put(i, mp.get(i)+1);
				}
				else {
					mp.put(i, 1);
				}
			}
			System.out.println(mp);
			
		}
		
		
		

	}

}
