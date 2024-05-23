package Arrays;

public class thirdLargestElement{
	static int thirdLargestElement(int a[]) {
		
		int n=a.length;
		int l=0;
		int sl=0;
		int tl=0;
		for(int i=1;i<n;i++) {
			if(a[i]>a[l]) {
				tl=sl;
				sl=l;
				l=i;
				
			}
			else if(a[i]>a[sl]&&a[i]<a[l]) {
				tl=sl;
				sl=i;
			}
			else if(a[i]>a[tl]&&a[i]<a[sl]) {
				tl=i;
			}
		}
		return tl;
		
	}
	public static void main(String[] args) {
		int []arr= {13,8,6,2,5,4,8,3,7};
		int thirdLargestindex=thirdLargestElement(arr);
		System.out.println(arr[thirdLargestindex]);
	}

}
