import java.util.Arrays;
public class FindFirstAndLast {
    public int[] searchindex(int target, int[] arr) {
        int[] ans = {-1, -1};
        ans[0] = findFirstLast(target, arr, true);
        ans[1] = findFirstLast(target, arr, false);
        return ans;
    }
    public int findFirstLast(int t, int[] arr, boolean findstartandend){
        int result = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] < t){
                start = mid +1;
            }
            else if(arr[mid] > t) {
                end = mid-1;
            }
            else{
                result = mid;
                if(findstartandend == true){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        FindFirstAndLast ffl = new FindFirstAndLast(); // Create an instance of the class
        int[] arr = {5, 9, 9, 9, 12, 19, 22};
        int[] ans = ffl.searchindex(9, arr);//change the target value and arr as per needed..!
        System.out.println(Arrays.toString(ans)); // Use Arrays.toString to print the array
    }
    
}
