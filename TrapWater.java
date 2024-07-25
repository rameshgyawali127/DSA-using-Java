public class TrapWater {
    public static void main(String[] args) {
        int[] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(totaltrapwater(arr));
    }
    public static int totaltrapwater(int[] array){
        if (array == null || array.length < 3) {
            return 0;
        }
        // to find the left side 
        int[] arrayleft = new int[array.length];
        int[] arrayRight = new int[array.length];
        arrayleft[0] = array[0];
        arrayRight[array.length - 1] = array[array.length - 1];

        for(int i = 1; i< array.length-1; i++){
            arrayleft[i] = Math.max(arrayleft[i-1],array[i]);
        }
        for (int i = arrayRight.length-2; i >= 0; i--) {
            arrayRight[i] = Math.max(arrayRight[i+1] , array[i]);
        }
        int trappedWater = 0;
        for (int i = 0; i < arrayRight.length; i++) {
            trappedWater += Math.min(arrayRight[i] , arrayleft[i]) - array[i];
        }
        return trappedWater;
    }
}
