package Arrays;

public class trapWater {
	static int trap(int[] height) {
        int n=height.length;
         int []l=new int[n];
         int []r=new int[n];
         l[0]=height[0];
         r[n-1]=height[n-1];
         int sum=0;
         for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],height[i]);

         }
         for (int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i]);
         }
        for(int i=0;i<n;i++){
          int area=Math.min(l[i],r[i])-height[i];
          sum+=area;
        }
        return sum;

    }
	public static void main(String[] args) {
		
		int []heights= {0,1,0,2,1,0,1,3,2,1,2,1};
		int maxtrap=trap(heights);
		System.out.println(maxtrap);
	
		

	}

}
