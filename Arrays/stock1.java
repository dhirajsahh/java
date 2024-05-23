package Arrays;

public class stock1 {
          
	public static int maxProfit(int[] prices) {
        int minIndex=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<prices[minIndex]){
                minIndex=i;
            }
        }
        int maxprofitIndex=minIndex;
        for(int i=minIndex+1;i<n;i++){
           if(prices[maxprofitIndex]<prices[i]){
            maxprofitIndex=i;
           }
        }
        System.out.println(maxprofitIndex);
        return minIndex;
    }
	public static void main(String[] args) {
		int []prices= {7,1,5,3,6,4};
		int minIndex=maxProfit(prices);
		System.out.println(minIndex);

	}

}
