package day18amultidimensionalarrays;

public class MultiDimensionalArrays02 {
public static void main(String[] args) {
	
	int[][] arr1= {{1,2},{3,4,5},{6}};
	int[][] arr2= {{7,8,9},{10,11},{12}};
	
	int row=arr1.length<arr2.length?arr1.length:arr2.length;
	int sum=0;
	for(int i=0;i<row;i++) {
		int column=arr1[i].length<arr2[i].length?arr1[i].length:arr2[i].length;
		for(int j=0;j<column;j++) {
			sum+=arr1[i][j]+arr2[i][j];
		}
	}
	System.out.println(sum);
	
}
}
