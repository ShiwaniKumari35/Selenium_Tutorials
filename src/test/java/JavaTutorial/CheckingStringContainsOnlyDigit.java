package JavaTutorial;

public class CheckingStringContainsOnlyDigit {
        public static boolean onlyDigits(String str, int n)
        {
            for (int i = 0; i < n; i++) {

                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args)
        {
            String str = "1234";
            int len = str.length();

            System.out.println(onlyDigits(str, len));
        }
}
