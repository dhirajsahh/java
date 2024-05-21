package java_basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the ageList");
//		
//		int ageList[]=new int[5];
//		int n=5;
//		for(int i=0;i<n;i++) {
//			ageList[i]=sc.nextInt();	
//		}
//		for (int i=0;i<n;i++) {
//			System.out.println("age of a roll number "+i+" is "+ageList[i]);
//		}
//		int []age= {1,2,34,43,44};
//		int n=5;
//		for (int i=0;i<n;i++) {
//		System.out.println("age of a roll number "+i+" is "+age[i]);
//		}
		int [][]a= {
				{2,3,4},
				{3,4,2},
				};
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
		

	}

}
