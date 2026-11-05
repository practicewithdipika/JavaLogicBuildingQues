package JavaLogicBuildingQues;

public class SwapNumbers {

	public static void main(String[] args) {
		int a= 10;
		int b=20;
		
		//1st solution:
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of a is:"+b);
		
		
		System.out.println("=======================================");
		
		int c=50;
		int d=90;
		
		System.out.println("previous value of c= "+ c);
		System.out.println("previous value of d= " +d);
		
		d= d+c; //d = 140, c=50
		c= d-c; //c = 90
		d= d-c;
		
		System.out.println(c);
		System.out.println(d);

	}

}
