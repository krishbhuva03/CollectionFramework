package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_of_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder comb,
                           List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }

    // Optional: for quick testing
    public static void main(String[] args) {
        Letter_Combinations_of_Phone_Number solver = new Letter_Combinations_of_Phone_Number();
        System.out.println(solver.letterCombinations("23"));
    }
}
