public class FindMaxAndMin {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 4, 2, 9, 3 };

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                min = arr[i];
                max = arr[i + 1];
            }
        }
        System.out.println(
                "=========================================== Vaishnavi =======================================");
        System.out.println("min :" + min + " and max :" + max);

        findmaxandmin(arr);

    }

    public static void findmaxandmin(int arr[]) {

        // int arr[] = { 1, 5, 0, 2, 9, 3 };

        int max = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("=========================================== Aishu =======================================");
        System.out.println("min :" + min + " and max :" + max);
    }
}
