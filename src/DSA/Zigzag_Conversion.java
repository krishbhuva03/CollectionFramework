package DSA;

class Zigzag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;  // special case

        StringBuilder res = new StringBuilder();
        int increment = 2 * (numRows - 1);

        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < s.length(); i += increment) {
                // add character from current rowr s
                res.append(s.charAt(i));

                // add the diagonal element (only for middle rows)
                if (r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length()) {
                    res.append(s.charAt(i + increment - 2 * r));
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Zigzag_Conversion Z1 = new Zigzag_Conversion();
        String name = "MYNAMEISKRISHBHUVA";
        int noRow = 2;
        System.out.println(Z1.convert(name, noRow));
    }
}

