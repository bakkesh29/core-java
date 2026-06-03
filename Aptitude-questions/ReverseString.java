public class ReverseString {
    public static void main(String[] gretings) {

        String name = "hello";

        for(int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}