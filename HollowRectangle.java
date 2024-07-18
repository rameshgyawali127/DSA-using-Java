public class HollowRectangle {
    public static void Hollow(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if(j == 1||i==1||i==n||j ==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            
        }
    }
    public static void main(String[] args) {
        int n = 10;
        Hollow(n);
    }
} 
//      * * * * * 
//     *       *
//    *       *
//   *       *
//  * * * * * 
