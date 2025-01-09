import java.util.ArrayList;
import java.util.List;

public class Q_412_Fizz_Buzz {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                str.add("FizzBuzz");
            } else if (i % 3 == 0) {
                str.add("Fizz");
            } else if (i % 5 == 0) {
                str.add("Buzz");
            } else {
                str.add(String.valueOf(i));
            }
        }
        System.out.println();
        for (String string : str) {
            System.out.print(string + " ");
        }

        return str;
    }
}
