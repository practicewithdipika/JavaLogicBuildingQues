package JavaLogicBuildingQues;

import java.util.ArrayList;

public class ReverseAString {

	public static void main(String[] args) {
//		String str = " I am Dipika and I am learning programming";
//		
//		int firstOcc= str.indexOf('a');//3
//		System.out.println(firstOcc);
//		
//		int secondOcc= str.indexOf('a', firstOcc+1);
//		System.out.println(secondOcc);
//		
//		int thirdOcc= str.indexOf('a', secondOcc+1 );
//		System.out.println(thirdOcc);
		
		
		
//		String msg = "Welcome admin";
//		
//		if(msg.indexOf("admin")==8) {
//			System.out.println("pass");
//		}else {
//			System.out.println("Fail");
//		}
		
		
		//reverse a string
//		String s= "abcdefg";
//		String newstr="";
//		for(int i=s.length()-1; i>=0;i--) {
//			char c =s.charAt(i);
//			newstr = newstr +c;
//			
//		}
//		System.out.print(newstr);
		
		
//		int a[]= new int[5];
//		int b[]= {1,3,10,67};
//		a[0]=10;
//		a[2]=14;
//		a[3]=20;
//		a[4]=30;
//		System.out.println(Arrays.toString(a));
//		a[4]=80;
//		System.out.println(Arrays.toString(a));
//		//for loop
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		//for each loop
//		for(int e: a) {
//			System.out.println(e);
//		}
//		
		
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Dipika");
		ar.add("nimje");
		ar.add(null);
		ar.add("rekha");
		ar.add("nimje");
		ar.add(null);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		//ar.add(1, "Digambar");
		ar.set(5,"family");
		//System.out.println(ar.size());
		//System.out.println(ar.get(1));
		//System.out.println(ar.get(2));
		
		
		for(String e: ar) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String str="madae";
//		String result="";
//		for(int i=str.length()-1; i>=0; i--) {
//			result = result + str.charAt(i);
//		}
//		System.out.println(result);
//		if(result.equals(str)) {
//			System.out.println("this string is pallidrome:" + result );
//		}else {
//			System.out.println("Not Pallidrome");
//		}
	}

}
