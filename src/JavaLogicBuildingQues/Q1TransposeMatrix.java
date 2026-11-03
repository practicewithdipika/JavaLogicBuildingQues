package JavaLogicBuildingQues;

public class Q1TransposeMatrix {
	public static void main(String[] args) {
		//a= [1 2]      result= [1 3 5]
		//   [3 4]              [2 4 6]2X3
		//   [5 6]3X2
		
		int a[][]= new int[3][2];
		System.out.println("Total number of rows:" + a.length);
		System.out.println("Total number of column:" + a[0].length);
		
		a[0][0]= 1;
		a[0][1]= 2;
		a[1][0]= 3;
		a[1][1]= 4;
		a[2][0]= 5;
		a[2][1]= 6;
		
		//int a[][]= new int[0][0];--> empty matrix
		//int a[][] = {{1,2},{3,4},{5,6}};
		if(a==null || a.length==0 || a[0].length==0) {
			System.out.println("Transpose is not possible");
		}else {
		
			for(int row=0; row<a.length; row++) {
				for(int col=0; col< a[0].length; col++) {
					System.out.print(a[row][col] + " ");
				}
				System.out.println();
			}
			
			int result[][] = new int[2][3];
			//Transpose of Matrix
			for(int row=0; row<a.length; row++) {
				for(int col=0; col< a[0].length; col++) {
					result[col][row]=a[row][col];
				}
			}
			
			System.out.println("<-----Transpose Matrix--(Printing of Resultant Matrix)------->");
			//resultant Matrix
			for(int row=0; row<result.length; row++) {
				for(int col=0; col< result[0].length; col++) {
					System.out.print(result[row][col] + " ");
				}
				System.out.println();
			}
		}
	}

}
