
public class SquareStarPattern {

    public static void main(String[] args) {

        System.out.println();
        for (int i = 0; i < 4; i++) { // column
            for (int j = 0; j < 4; j++) { // row
                if (i == 0 || i == 3 || j == 0 || j == 3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
