import java.util.Scanner;

public class Binarysearch {
    static int FindingTheIndexOfTargetValue(int t, int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid]< t){
                start = mid +1;
            }
            else if(arr[mid] > t) {
                end = mid-1;
            }
            else if(arr[mid] == t){
                return mid;
            }
        }
        return -1;//it returns the smallest value of the list however the value should greater than target!
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array! :");// array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int  i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int result =  FindingTheIndexOfTargetValue(target, arr);
        System.out.println("The target value is belongs to "+ result + " index ");
    }
    
}
