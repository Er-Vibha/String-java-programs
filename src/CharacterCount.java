public class CharacterCount {
    public static void main(String[] args) {
        String input="Java is Best";
        int count=0;
        char[] chars=input.toCharArray();
        for(int i=0; i<chars.length;i++){
             count++;
        }
        System.out.println("Total character count is "+ ""+count);
    }
}
