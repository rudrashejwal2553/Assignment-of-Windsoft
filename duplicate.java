package windsoft;
import java.util.HashMap;
import java.util.Map;
public class duplicate {
	public static void findDuplicateCharacters(String str) {
      
        Map<Character, Integer> charFreq = new HashMap<>();
        
        str = str.toLowerCase();
      
        for (char ch : str.toCharArray()) {

            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }
     
        System.out.println("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Java program is a OOP language  hard to execute but Java language is robust";
        findDuplicateCharacters(inputString);
    }
}
