//Not passed the all sample test 
import java.util.*;
public class addonenumber {
    public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n]; 
        int result = 10;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            result = result*10 + arr[i];
        }
        result = result + 1;
        for (int j = arr.length -1 ; j >= 0; j--) {
           arr[j] = result % 10; 
           result = result / 10;
        }
        System.out.println("The final output is :");
        if(arr[0] == 0)
            arr[0] = 1;

            
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
}
