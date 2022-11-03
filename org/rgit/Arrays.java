package org.rgit;

public class Arrays {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//int arr2[][]=new int[3][3];
		int arr3[][]= {{2,3,4},{5,6,7},{8,9,10}};
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<3;j++) {
			System.out.print(arr3[k][j]+"|");
			
		}
		System.out.println();

	}
		//int arr4[][]=new int[3][];//Jagged arrays(column size unknown
		
		
	}
}
