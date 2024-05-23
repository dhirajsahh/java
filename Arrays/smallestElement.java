package Arrays;

public class smallestElement {
	static int smallestElementinArray(int a[]) {
		
		int n=a.length;
		int min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int []arr= {13,8,6,2,5,4,8,3,7};
		int smallestElement=smallestElementinArray(arr);
		System.out.println(smallestElement);
		
		

	}

}
