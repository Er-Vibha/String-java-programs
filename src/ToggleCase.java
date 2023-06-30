import java.util.Scanner;

public class ToggleCase {
    public static String toggleStringCase(String str){
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            char c=chars[i];
            if(Character.isUpperCase(c)){
                chars[i]=Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i]=Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String toggledString= toggleStringCase(input);
        System.out.println("Input String " +input);
        System.out.println("Output String " +toggledString);
    }
}