package JavaLogicBuildingQues;

public class Q2FindLengthOfString {

	public static void main(String[] args) {
		//find the length of the String without using .length() method
		String data = "hello";
		System.out.println(data.length());//just to check
		char chAr[] = data.toCharArray();
		
		if(chAr==null || chAr.length==0) {
			System.out.println("length cannot be calculated");
		}else {
			int count=0; //result
			for(char c: chAr) {
				count++;
			}
			System.out.println("length of the String: "+count);
		}
		

	}

}
