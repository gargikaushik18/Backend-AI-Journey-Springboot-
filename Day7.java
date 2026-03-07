// Strings, which are extremely important because backend APIs mostly handle text data (names, emails, passwords, JSON, etc.).
// A String is a sequence of characters.
public class Day7 {

    public static void main(String[] args) {

        String text = "Hello Backend World";

        // 1 Length
        System.out.println("Length: " + text.length());

        // 2 Character at index
        System.out.println("Character at index 1: " + text.charAt(1));

        // 3 Substring
        System.out.println("Substring (0,5): " + text.substring(0, 5));

        // 4 Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // 5 Convert to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // 6 Replace
        System.out.println("Replace: " + text.replace("Backend", "Java"));

        // 7 Contains
        System.out.println("Contains 'Backend': " + text.contains("Backend"));

        // 8 Starts with
        System.out.println("Starts with Hello: " + text.startsWith("Hello"));

        // 9 Ends with
        System.out.println("Ends with World: " + text.endsWith("World"));

        // 10 Index of
        System.out.println("Index of Backend: " + text.indexOf("Backend"));

        // 11 Last index of
        System.out.println("Last index of 'o': " + text.lastIndexOf("o"));

        // 12 Equals
        String a = "Java";
        String b = "Java";
        System.out.println("Equals: " + a.equals(b));

        // 13 Equals ignore case
        String c = "java";
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(c));

        // 14 Trim
        String space = "   Hello   ";
        System.out.println("Trim: '" + space.trim() + "'");

        // 15 Split
        String sentence = "Java Spring Boot Backend";
        String[] words = sentence.split(" ");

        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 16 Is empty
        String empty = "";
        System.out.println("Is empty: " + empty.isEmpty());

    }
}