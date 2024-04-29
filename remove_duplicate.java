class remove_duplicate {
    public static void main(String[] args) {
        int arr[] = {0,1,1,2,2,3,3,4,4,5};
        int  i = 0;
        int temp;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] < arr[j]) {
                // then only we are getting unique element right ? make sense!!
                temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        System.out.println(" The unique element of the sorted array is : "+ (i+1));
    }
}