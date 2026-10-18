class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers aur numbers ending with 0 (except 0 itself) palindrome nahi hote
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Loop tab tak chalega jab tak original number reversed half se bada hai
        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = (reversedHalf * 10) + lastDigit;
            x = x / 10; // Last digit ko remove karne ke liye
        }

        // Even length numbers ke liye: x == reversedHalf (e.g., 1221 -> x = 12, reversedHalf = 12)
        // Odd length numbers ke liye: x == reversedHalf / 10 (e.g., 121 -> x = 1, reversedHalf = 12. 12/10 = 1)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
