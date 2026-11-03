package JavaLogicBuildingQues;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q5RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		int a[]= {10, 90, 10, 30, 50,90};
		
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		
		for(int i: a) {
			dataSet.add(i);
		}
		System.out.println(dataSet);
		
		int result[]=dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));
	}

}
