public class FIndMountainArray {
    public static void main(String[] args) {
        FIndMountainArray fma = new FIndMountainArray();
        int arr[] = { 3,5,9,11,10,8,7,6,1};
        int m = 11;
        System.out.println(fma.findInMountainArray(m,arr));
    }
    public int findInMountainArray(int mountainer, int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = findhighestpeakpoint(arr,start, end);
        int value = findincrease(arr,start,mid,mountainer);
        if(value != -1){
            return value;
        }
        else{
           return finddecrease(arr,mid,end,mountainer);
        }
    }
    public int findincrease(int[] arr, int start, int end, int mountainer){
        int mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] == mountainer){
                return mid;
            }
            else if(arr[mid] < mountainer){
                start = mid +1;
            }
            else{
                end = mid -1;
            } 
        }
        return -1;
    }
    public int finddecrease(int[] arr, int start, int end, int mountainer){
        int mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] == mountainer){
                return mid;
            }
            else if(arr[mid] > mountainer){
                start = mid +1;
            }
            else{
                end = mid -1;
            } 
        }
        return -1;
    }
    public int findhighestpeakpoint(int[] arr,int start, int end){
        int mid;
        while(start < end){
            mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
