import java.util.Scanner;
class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        String[] arr = new String[5];
        for(int i = 0; i < n;i++){
            arr[i]= sc.next();
        }
        int a = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() > a) {
                a = arr[j].length();
            }
        }
        System.out.println("The Longest string of the given list or arrya is : "+ a);
    }
}
