public class Q1480_Running_Sum_of_1d_Array {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int sumarr[] = new int[nums.length];
        int sum = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            sum = sum + nums[idx];
            sumarr[idx] = sum;
        }

        for (int a : sumarr) {
            System.out.println(a);
        }

    }
}
