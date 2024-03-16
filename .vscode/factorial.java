public class factorial {
    public static int factorialSum(int n){
        if(n == 0 || n == 1)
            return 1;
        else{
            int b = factorialSum(n-1);
            int c = b*n;
             return c;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" Sum is :"+ factorialSum(n));
    }
}
