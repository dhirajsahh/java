package Array;

public class Arraymain {
	
	static void leadersinArray(int a[]) {
		int largest=Integer.MIN_VALUE;
		int n=a.length;
		for(int i=n-1;i>=0;i--) {
			if(a[i]>largest) {
				largest=a[i];
				System.out.print(a[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int []arr= {1,6,3,4,2};
		leadersinArray(arr);
		
		
	}

}
