import java.util.Arrays;
public class MedianofSortedArray {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int a1 = a.length;
        int temp;
        int b1 = b.length;
        int c1 = a1 + b1;
        int [] c = new int[c1];
        for(int i = 0; i< a1;i++) {
            c[i] = a[i];
        }
        for(int i = 0;i < b1; i++){
            c[a1+ i] = b[i];
        }
        Arrays.sort(c);
        double median;
        if(c1%2 != 0)
        {
            median = c[c1/2];
        }
        else {
            int mid1 = c1 / 2;
            int mid2 = mid1 - 1;
            median = (c[mid1] + c[mid1]) / 2.0;
        }

        
        return median;
    }
    public static void main(String [] args){
        int [] a = {1,3,6,9,10};
        int [] b = {2,7,10,11,19,22};
        MedianofSortedArray sc = new MedianofSortedArray();
        double d = sc.findMedianSortedArrays(a,b);
        System.out.println(d);
    }
}