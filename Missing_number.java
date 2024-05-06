/* Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array */
public class Missing_number {
    public static void main(String[] args) {
       int arr[] = {0,1,3};
       System.out.print(missing_number(arr));
    }  
    public static int missing_number(int arr[]) {
        int len = arr.length;
        for(int i = 0;i< arr.length;i++){
            len = len ^ i;
            len= len ^ arr[i];
        }
        return len;

    }
}
