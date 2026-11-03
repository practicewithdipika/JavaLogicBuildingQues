package JavaLogicBuildingQues;

import java.util.Arrays;

public class Q6RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,50,30,10,40,50};
		System.out.println(Arrays.toString(a));
		
		int result[]=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(result));
		

	}

}
