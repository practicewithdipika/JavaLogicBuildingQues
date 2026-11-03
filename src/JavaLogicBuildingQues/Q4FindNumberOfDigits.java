package JavaLogicBuildingQues;

public class Q4FindNumberOfDigits {

	public static void main(String[] args) {
		int num = 987654321;
		numberDigit(num);
	}
	public static void numberDigit(int num) {
		int count=0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Total Number of Digits in a number is :"+ count);
	}
}
