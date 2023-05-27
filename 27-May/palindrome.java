public class palindrome {
    void checkPalindrome(String word) {
        int last = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (i == last - 1) {
                System.out.println("It is a palindrome");
                return;
            }
            if (word.charAt(i) == word.charAt(last - i - 1)) {
                continue;
            } else {
                System.out.println("Not a palindrome");
                return;
            }
        }
    }

    public static void main(String[] args) {
        String word = "rajar";
        palindrome worker = new palindrome();
        worker.checkPalindrome(word);
    }
}
