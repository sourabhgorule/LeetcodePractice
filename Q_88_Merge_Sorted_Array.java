class Q_88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the last valid element in nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        // Using a for loop to merge the arrays from the back
        for (; k >= 0; k--) {
            if (j < 0) {
                // All elements of nums2 have been merged
                break;
            }

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
    }

}