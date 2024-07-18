public class Butterfly {
    public static void ButterflyPattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int  j= 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();   
        }
    for (int i = n; i >0; i--) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        for (int  j= 0; j < 2*(n-i); j++) {
            System.out.print(" ");
        
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
            
        }
        System.out.println();   
    }
}
    public static void main(String[] args) {
        int n = 10; 
        ButterflyPattern(n);
    }
}
// *          *
// * *      * *
// * * *  * * * 
// * * *  * * */       n =3, space = 4 ; N+1-2*i
// * *      * *
// *          *