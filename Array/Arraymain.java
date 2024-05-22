package Array;

public class Arraymain {
	
	static void leadersinArray(int a[]) {
		int largest=Integer.MIN_VALUE;
		int j=0;
		int n=a.length;
		int []b=new int[n];
		for(int i=n-1;i>=0;i--) {
			if(a[i]>largest) {
				largest=a[i];
				b[j++]=a[i];
			}
		}
		for (j=j-1;j>=0;j--) {
			System.out.print(b[j]+ " ");
		}
		
	}
	static void maxsumsubArray(int a[]) {
		int n=a.length;
		int s=0;
        int e=0;
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			cursum=cursum+a[i];
			
			if(maxsum<cursum) {
				maxsum=cursum;
				e=i;
			}
			if(cursum<0) {
				cursum=0;
				s=i+1;
			}
		}
		System.out.println(maxsum);
		System.out.println("index is from "+s+" "+e);
	}
	
	public static void greatestright(int a[]) {
		int n=a.length;
		int max=Integer.MIN_VALUE;
		for (int i=n-1;i>=0;i--) {
			
			if(a[i]>max) {
				max=a[i];
				
			}
			a[i]=max;
		
		}
		
	}
	//[1,8,6,2,5,4,8,3,7]
       static int containerwithmostwater(int a[]) {
    	   int n=a.length;
    	   int l=0;
    	   int r=n-1;
    	   int maxarea=0;
    	   while(l<r) {
    		   int height=Math.min(a[l],a[r]);
    		   int width=r-l;
    		   int area=height*width;
    		   
    		   maxarea=Math.max(maxarea,area);
    		   if(a[l]<a[r]) {
    			   l++;
    		   }
    		   else r--;
    	   }
    	   return maxarea;
       }
	public static void main(String[] args) {
		int []arr= {1,8,6,2,5,4,8,3,7};
//		leadersinArray(arr);
//		maxsumsubArray(arr);
//		greatestright(arr);
		int maxwater=containerwithmostwater(arr);
		System.out.print(maxwater);
		
//		for (int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
	}

}
