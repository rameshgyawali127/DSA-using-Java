public class Stock_Maket_Max_benifit_II {
    public static void main(String[] args) {
        int arr[]= {1,5,6,7,3,8,20,23,9,7};
        int profit = 0;
        for(int i =0;i< arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                profit += arr[i+1]-arr[i];
            }
        }
        System.out.println("The max profit we can make from the following days : " + profit);
    }
    
}
