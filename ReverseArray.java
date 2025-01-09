public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 3, 2, 6, 5 };
        int revarr[] = new int[arr.length];
        int cnt = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revarr[cnt] = arr[i];
            cnt++;
        }
        System.out.println();
        withoutUsingSecondArray(arr);

    }

    public static void withoutUsingSecondArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
