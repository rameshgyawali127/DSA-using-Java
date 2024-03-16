import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    static char FindingSmallestLetter(char t, char arr[]){
        int start = 0;
        int end =  arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(t >= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array! :");// array size
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int  i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the target letter: ");
        char target = sc.next().charAt(0);
        char result = FindingSmallestLetter(target, arr);
        System.out.println("The smallest letter in the given string is: "+ result );
    }
    
}
