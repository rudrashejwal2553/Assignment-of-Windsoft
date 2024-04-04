package windsoft;
import java.util.HashMap;
public class WordCount {
	public static int countWords(String str) {
       
        String[] words = str.split("\\s+");

        
        HashMap<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        return wordFreq.size();
    }

    public static void main(String[] args) {
        String inputString = "HELLO MY NAME IS RUDRA AND NOW I AM IN LAST YEAR AT JSPM BSIOTR WAGHOLI";
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }
}

