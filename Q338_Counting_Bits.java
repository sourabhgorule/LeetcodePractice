public class Q338_Counting_Bits {
    // Input: n = 2
    // Output: [0,1,1]
    // Explanation:
    // 0 --> 0
    // 1 --> 1
    // 2 --> 10

    public static void main(String[] args) {
        convertIntegerToBinaryV2(5);
    }

    public static void convertIntegerToBinary(int num){
        int [] binary = new int[num+1];
        char search = '1';
        for (int i = 0; i < num+1 ; i++) {
            // binary[i] = Integer.toBinaryString(i);
            binary[i] = (int)(Integer.toBinaryString(i).chars().filter(ch -> ch == search).count());
            System.out.println(i+" : "+Integer.toBinaryString(i) + " : " +Integer.toBinaryString(i).chars().filter(ch -> ch == search).count());
    }
}

public static void convertIntegerToBinaryV2(int num){
    int[] bitsCount = new int[num + 1];
    for (int i = 0; i < num+1 ; i++) {
       bitsCount [i] =Integer.bitCount(i);
    }

    for (int i : bitsCount) {
        System.err.println(i);
    }

}


}
