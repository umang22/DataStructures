package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "madam";
        char[] myStr = Reverse(str);
        System.out.println("String after reverse");
        /*for (char ch:myStr) {
            System.out.print(ch);
        }*/
        System.out.println(myStr);
        if (str.equals(String.valueOf(myStr))) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }

    private static char[] Reverse(String str) {
        char[] strArr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        return strArr;
    }
}
