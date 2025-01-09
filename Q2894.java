/**
 * Q2894
 */
public class Q2894 {

    public static void main(String[] args) {
        differenceOfSums(10, 3);
    }

    public static int differenceOfSums(int n, int m) {
        
        int divisible = 0;
        int nonDivisible = 0;

        for(int i=1;i<=n;i++){
            if(i % m == 0){
                divisible = divisible + i;
            }else{
                nonDivisible = nonDivisible + i;
            }
        }
        Math.abs( nonDivisible - divisible);

        return 0 ;

    }
}