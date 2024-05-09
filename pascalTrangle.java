/*
 1 
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1  
 */
public class pascalTrangle {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        for(int i=0;i < 5;i++){
            for(int j=0; j <= i; j++){
                if(j==0 || i==j){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
