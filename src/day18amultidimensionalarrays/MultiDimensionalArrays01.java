package day18amultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
public static void main(String[] args) {
	
	int arr[][]=new int[3][2];
	System.out.println(Arrays.deepToString(arr));
	
	int brr[][] = {{2,3},{12,13,14,16,15},{7},{-2,-3,-4}};
	System.out.println(Arrays.deepToString(brr));
	
	int[][] crr= {{2,3},{12,13,14}};
	int sum=0;
	for(int i=0;i<crr.length;i++) {
		for(int j=0;j<crr[i].length;j++) {
			sum+=crr[i][j];
		}
	}
	System.out.println(sum);//44
	
}
}
