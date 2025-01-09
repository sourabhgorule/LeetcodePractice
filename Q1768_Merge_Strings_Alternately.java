public class Q1768_Merge_Strings_Alternately {

    public static void main(String[] args) {
        mergeStringAlternately("ABCEFG", "PQR");
    }

    public static void mergeStringAlternately(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        String concatString = "";

        int cnt = Math.max(str1Length, str2Length);

        for (int i = 0; i < cnt; i++) {
            if (i < str1Length) {
                concatString += str1.charAt(i);
            } else {
                concatString += " ";
            }

            if (i < str2Length) {
                concatString += str2.charAt(i);
            } else {
                concatString += " ";
            }

        }
        System.out.println();
        System.out.println(concatString);
    }
}