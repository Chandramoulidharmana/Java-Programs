// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


        static boolean isPalindrome(int x) {
            int rem;
            int res = 0;
            int s = x;
            if (x < 0) {
                return false;
            }
            while (x > 0) {
                    rem = x % 10;
                    res = (res * 10) + rem;
                    x = x / 10;
                }

                if (res == s) {
                    return true;

                } else {
                    return false;
                }
            }

    public static void main(String[] args) {
        int x = 121;
        isPalindrome(x);
        }
    }