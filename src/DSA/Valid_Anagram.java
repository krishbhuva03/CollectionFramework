package DSA;

import java.util.stream.Collectors;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t){
        boolean result = true;

        String sorteds1 = s.chars()
                           .sorted()
                           .mapToObj(c -> String.valueOf((char)c))
                           .collect(Collectors.joining());


        String sorteds2 = t.chars()
                           .sorted()
                           .mapToObj(c -> String.valueOf((char)c))
                           .collect(Collectors.joining());

        System.out.println("sorted string 1 ="+sorteds1);
        System.out.println("sorted string 1 ="+sorteds2);

        return sorteds1.equals(sorteds2);
    }

    public static void main(String[] args) {
        Valid_Anagram v1 = new Valid_Anagram();
        String s1 = "krish";
        String s2 = "hsirk";

        System.out.println(v1.isAnagram(s1,s2));
    }
}
