public class Recursion{
        public static void printNumber(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
        }
     public static void main(String arg[]) {
        int n = 1;
        printNumber(n);
        
    }
}