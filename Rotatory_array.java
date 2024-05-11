import java.util.Arrays;

public class Rotatory_array{
    public static void main(String[] args) {
        int[] nums= {2,3,6,7,10,12};
        int k = 3;
        System.out.println(Arrays.toString(rotate(num, k)));
    


    }
    public static void reverse(int nums[], int li, int ri){
            while(li < ri){
                int temp = nums[li];
                nums[li] = nums[ri];
                nums[ri] = temp;
                li++;
                ri--;
            }
    }
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0,nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }
}