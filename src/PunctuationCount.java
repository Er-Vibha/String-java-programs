public class PunctuationCount {
    public static void main(String[] args) {
        int count=0;
        String S="Hi, I am learning Java!";
        for(int i=0;S.length()>i;i++)
        {
            if(S.charAt(i)=='!'||S.charAt(i)=='"'||S.charAt(i)=='.'||S.charAt(i)==','||S.charAt(i)==';'||S.charAt(i)==':'||S.charAt(i)=='?'){
                count++;

            }

        }
        System.out.println(count);
    }
}
