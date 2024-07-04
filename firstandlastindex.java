import java.util.Arrays;

public class firstandlastindex {
    public int[] firstandlastindex1(int[] arr, int target){
        int ans[] ={-1, -1};
        ans[0]  = firstlastindex(arr,target,true);
        ans[1]  = firstlastindex(arr,target,false);
        return ans;
    }
    public static int firstlastindex(int[] arr, int target, boolean firstindex){
        int start = 0,mid;
        int end = arr.length-1;
        int result=0;
        while(end >= start){
            mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                result = mid;
                if(firstindex){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        firstandlastindex fli = new firstandlastindex();
        int[] arr = {3,5,9,10,10,10,25,35};
        int target = 10;
        int ans[] = fli.firstandlastindex1(arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
