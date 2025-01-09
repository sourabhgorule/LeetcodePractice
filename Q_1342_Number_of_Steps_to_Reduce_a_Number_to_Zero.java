public class Q_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        numberOfSteps(123);
    }

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            num = num / 2;
            step++;
            if (num % 2 != 0) {
                num = num - 1;
                step++;
            }
        }

        // return steps;

        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; // Divide by 2 if even
            } else {
                num -= 1; // Subtract 1 if odd
            }
            steps++; // Count each step
        }
        return steps;
    }
}
