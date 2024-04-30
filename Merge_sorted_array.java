class Merge_sorted_array {
    public static void main(String[] arg) {
        int nums1[] = {1, 2, 6, 0, 0, 0};
        int nums2[] = {2, 3,5};
        int m = 3;
        int n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        for (int p = 0; p < m + n; p++) {
            if (p != m + n - 1) {
                System.out.print(nums1[p] + ", ");
            } else {
                System.out.print(nums1[p]);
            }
        }
    }
}
