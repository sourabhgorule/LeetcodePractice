public class Q1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int arr[][] = { { 10, 2, 5 }, { 3, 4, 3 } };
        System.out.println();
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
