package DSA;

public class Count_and_Say {

    public String countAndSay(int n){
        if (n == 1) {
            return "1";
        }

        String say = countAndSay(n - 1);
        String result = "";

        for (int i = 0; i < say.length(); i++) {
            char ch = say.charAt(i);
            int count = 1;

            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }

            result += String.valueOf(count) + ch; // append instead of overwrite
        }

        return result;
    }

    public static void main(String[] args) {
        Count_and_Say C1 = new Count_and_Say();
        System.out.println(C1.countAndSay(5)); // should print "111221"
    }
}


