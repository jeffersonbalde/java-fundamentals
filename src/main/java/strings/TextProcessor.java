package strings;

/*

    Write a method that counts the number of words in a
    String and prints them individually on new lines.

 */
public class TextProcessor {
    public static void main(String[] args) {
        countWords("I Love Java");
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(String word : words){
            System.out.println(word);
        }
    }
}