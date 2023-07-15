public class VowelConsonant {
    public static void main(String[] args) {
        String s = "Hi I String";
        int countV = 0;
        int countC = 0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ) {
                countV++;
            } else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {
                countC++;
            }
        }
        System.out.println("Number of Vowels:" + countV);
        System.out.println("Number of Consonants:" + countC);
    }
}
