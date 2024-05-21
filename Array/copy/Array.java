package Array.copy;

public class Array {
          
	public static void deleteElement(int a[],int key) {
		int i=0;
		int n=a.length;
		for(;i<n;i++) {
		  if(a[i]==key) {
			  break;
		  }
		}
		if(i==n) return ;
		
			for(int j=i;j<n-1;j++) {
				a[j]=a[j+1];
		}
	}
	public static int largest(int a[]) {
		if(a.length==0) return -1;
		int maxindex=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[maxindex]) {
				maxindex=i;
			}
		}
		return maxindex;
	}
	public static int secondLargest(int a[]) {
		if(a.length<2) return -1;
		int fmaxindex=0;
		int smaxindex=-1;
		for (int i=1;i<a.length;i++) {
			if(a[i]>a[fmaxindex]) {
				smaxindex=fmaxindex;
				fmaxindex=i;
			}
			else if(a[i]<a[fmaxindex]&&(a[i]>a[smaxindex]||smaxindex==-1)) {
				smaxindex=i;
			}
			  
		}
		return smaxindex;
	}
	public static void removeDuplicate(int a[]) {
		if(a.length<0) return;
		int j=0;
		for (int i=1;i<a.length;i++) {
			if(a[i]!=a[j]) {
				a[j+1]=a[i];
				j++;
			}
		}
	}
	public static void leaders(int a[]) {
		int n=a.length;
		for (int i=0;i<n;i++) {
			int cur=a[i];
			boolean isleader=true;
			for(int j=i+1;j<n;j++) {
				if(a[j]>a[i]) {
					isleader=false;
					break;
				}
			}
			if(isleader) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int []a= {18,1,15,13,4,3,1};
    	int key=3;
    	leaders(a);
    	//removeDuplicate(a);
//    	for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//	}
//    	deleteElement(a,key);
    	
//    	int largestelement=largest(a);
//    	System.out.println(a[largestelement]);
//    	int secondlargestindex=secondLargest(a);
//    	System.out.println(secondlargestindex);
//    	System.out.println(a[secondlargestindex]);
    	
}
	static void deleteElement2() {
		int []arr= {1,3,4,2,8,6,5};
		int key=2;
		int result=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				result=i;
				arr[i]=arr[i+1];
			}
		}
		if(result==-1) {
			System.out.println("Key not found");
		}
		else
			System.out.println("key found at "+result+" and it is deleted");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
