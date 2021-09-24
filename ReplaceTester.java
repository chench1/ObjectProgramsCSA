/*
Charles Chen
9/23/21
Replaces the letters 'a', 'i', and 's' with '@', '!', and '$' respectively in a string containing the word mississippi
 */

public class ReplaceTester {
    public static void main(String[] args) {
        String string = "mississippiahahahahahahahahshdhf";
        System.out.println("Original string is: " + string);
        string = string.replace('a', '@');
        string = string.replace('i', '!');
        string = string.replace('s', '$');
        System.out.println("String with switched letters is: " + string);
    }
}
