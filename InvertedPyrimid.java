class InvertedPyrimid{
    public static void inverted(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 10;
        inverted(n);
    }
}
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3
// 1 2 
// 1