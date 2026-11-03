package JavaLogicBuildingQues;

public class practiceStringLengthAllthreeways {
	public static void main(String[] args) {
		String name="dipika";
		//1.
		System.out.println("length of the string:"+ name.length());
		
		//2. without using .length()-- use .to CharArray()
		
		char ch[]=name.toCharArray();
		int count=0;
		for(char e: ch) {
			count++;
		}
		System.out.println(count);
		
		//3. without length() and .toCharArray()----use .charAt()
		//.charAt('d')-->0 .... .charAt('a')-->5....charAt()-->exception
		int temp =0;
		try {
			while(true) {
				name.charAt(temp); //dipika
				temp++;//123456
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("length of String is:"+ temp);
			e.printStackTrace();
		
		}
	}

}
