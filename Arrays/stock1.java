package Arrays;

public class stock1 {
          
	public static int maxProfit(int[] prices) {
	        int n=prices.length;
	        //with extraspace
//	        int[]maxprice=new int[n];
//	         maxprice[n-1]=prices[n-1];
//	        for (int i=n-2;i>=0;i--){
//	            maxprice[i]=Math.max(maxprice[i+1],prices[i]);
//	        }
//	        int profit=0;
//	        for(int i=0;i<n;i++){
//	           profit=Math.max(profit,(prices[i]-maxprice[i]));
//	        }
//	        for(int i=0;i<n;i++) {
//	        	profit=Math.max(profit, (maxprice[i]-prices[i]));
//	        }
//	        
//	        return profit;
	        // without extraspace
	        int maxprofit=0;
	         int minsofar=prices[0];
	         for (int i=1;i<n;i++){
	            minsofar=Math.min(minsofar,prices[i]);
	            int profit=prices[i]-minsofar;
	            maxprofit=Math.max(maxprofit,profit);
	         }  
	         return maxprofit;
		
	}
	public static int maxProfit2(int[] prices) {
        int n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                 profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
	public static void main(String[] args) {
		int []prices= {7,1,5,3,6,4};
		int profit=maxProfit(prices);
//		System.out.println(profit);
		int secondProfit=maxProfit2(prices);
		System.out.println(secondProfit);

	}

}
