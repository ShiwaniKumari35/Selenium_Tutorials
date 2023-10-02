package JavaTutorial;

public class CountVowelAndConstant {

        public static void main(String[] args) {

            int vCount = 0, cCount = 0;
            String str = "MySelf Shiwani Kumari";

            str = str.toLowerCase();

            for(int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vCount++;
                }
                else {
                    cCount++;
                }
            }

            System.out.println("Number of vowels: " + vCount);
            System.out.println("Number of consonants: " + cCount);
        }
}
