public class AlphabetCheck {
    public static void main(String[] args) {
        //char c = 'a';
        char c = '$';

        if ((c >='a' && c <= 'z') || (c >='A' && c <= 'Z') ){
            System.out.println(c + "is an Alphabet");
        }
        else {
            System.out.println(c + "is not an Alphabet");

        }
    }
}
