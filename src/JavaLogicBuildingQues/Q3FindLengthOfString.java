package JavaLogicBuildingQues;

public class Q3FindLengthOfString {

	public static void main(String[] args) {
		String data= "hello";
		
		int count =0;
		while(true) {
			try {
			data.charAt(count);//01234(5 Exception)
			count++;//12345
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}
			
		

	}

}
