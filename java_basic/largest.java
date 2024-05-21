package java_basic;

import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
      int a,b,c;
      System.out.println("Enter the three number");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b) {
    	  if(b>c) {
    		  System.out.println("a is largest number");
    	  }
    	  
      }
      else if(a>c) {
    	  System.out.println("b is largest number");
      }
      else 
    	  System.out.println("c is largest");
	}
      
}
