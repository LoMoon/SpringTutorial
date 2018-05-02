package main.java.studylang.booLean;

public class booleanCompare {
    public static void main(String[] args) {
        Boolean b1, b2;
        b1 = new Boolean(true);
        b2 = new Boolean(false);
        int res = b1.compareTo(b2);

        String str1 = "Both values are equal ";
        String str2 = "Object value is true";
        String str3 = "Argument value is true";

        if (res == 0) {
            System.out.println(str1);
        } else if (res > 0) {
            System.out.println(str2);
        } else if (res < 0) {
            System.out.println(str3);
        }
    }
}
