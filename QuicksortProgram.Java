// This is Quick sort code which is Highly recommended to do this sorting, it's frequently asked qn in Technical round.
public class QuicksortProgram {
    public static void main(String[] args) {
       int arr[] = {2,3,9,10,29,1,6,56,97,23};
       quicksort(0,arr.length-1, arr);
       
    //    Printing the sorting array!
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + ",");
       }

    }
    public static void quicksort(int  lb,int up,int[] arr) {
        int mid;
        if(lb < up){
            mid = partition(lb,up,arr);
            quicksort(lb, mid-1, arr);// This is all about recursion which we are calling own function again and again to perform quick sort by using divide and conquer method.
            quicksort(mid+1, up, arr);
       }
    }
    public static int partition(int lb, int up, int[] arr){
        int end = up;
        int start = lb;
        int pivot = arr[start];
        int temp;
        while(end >= start) {
            while( start <= end && pivot >= arr[start]){// we have to check inside too to handle the index out of bound error! 
                start++;// increment when pivot is large!
            }
            while(start <= end && pivot < arr[end]){
                end--;// decrement when pivot is small
            }
            if(start < end){
                temp = arr[start];// Swapping with the start and end when above condition fails
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }
        temp = arr[end];// Don't confuse here we couldn't swap with pivot because pivot is kinda temp variable which we are taking right? 
        arr[end] = arr[lb];// So we have to swap with lower bound i.e basically we take a pivot Make sense? 
        arr[lb] = temp;// Then we could do swapping? 
        return end;//returing the pivot index..! 
    }
    
}
//Thanks for Watching Hit the star if it's helpful!!!
