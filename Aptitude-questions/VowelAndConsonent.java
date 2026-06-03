public class VowelAndConsonent {
    public static void main(String[] args) {
        // a e i o u
        char ch = 'e';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "  : is vowel");

        } else {
            System.out.println(ch + "Consonent");
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + "  :it is a vowel");

                break;

            default:
                System.out.println(ch + "  :it is a consonent");
                break;
        }
    }

}
