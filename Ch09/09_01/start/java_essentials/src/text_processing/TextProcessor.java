package text_processing;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("stop");
    }

// create a methods to count and display number of words in a text
    public static void countWords(String text) {

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);

        }
    }

    // create a method to display words backwards
    public static void reverseString(String text){
        for (int i = text.length() -1; i >= 0; i--) {
            String reversedWord = String.valueOf(text.charAt(i));
            System.out.print(reversedWord);

        }


    }



}