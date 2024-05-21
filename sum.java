public class sum{
    public static void printsum(int n, int a, int tot){
        if(n == a){
            tot += a;
            System.out.println(" sum is :" + tot);
            return;
        }
        tot += a;
        printsum(n,a+1,tot);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int n = 10;
        printsum(n,1,0);
    }
}
