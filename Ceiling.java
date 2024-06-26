import java.util.Scanner;
public class Ceiling {
    static int FindinglargestNumber(int t, int arr[]){
        int start = 0;
        int end = arr.length-1;
        if(t > arr[arr.length-1] ){
            return -1;
        }
        while(start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid]< t){
                start = mid +1;
            }
            else if(arr[mid] > t) {
                end = mid-1;
            }
            else{
                return t;
            }

        }
        return start;
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
        int result = FindinglargestNumber(target, arr);
        System.out.println("The Smallest value of the list greater than target is: "+ arr[result]);
    }
    
}
