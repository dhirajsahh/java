package java_basic;

public class leapyear {

	public static void main(String[] args) {
		int year=2028;
		if(year%400==0) {
			 System.out.println("Year is leap year");

		}
		else if (year%4==0 && year%100!=0) {
			  System.out.println("Year is leap year");	
			}
		else System.out.println("Year is not leap year");

	}

}
