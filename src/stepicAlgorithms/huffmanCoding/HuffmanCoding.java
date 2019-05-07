package stepicAlgorithms.huffmanCoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HuffmanCoding {
    public String encode(String sourceStr) {
        // sort letter by weight
        Map<Character, Integer> symbols = new HashMap<>();

        for (char c : sourceStr.toCharArray()) {
            int count = symbols.containsKey(c)
                    ? symbols.get(c)
                    : 0;

            count++;
            symbols.put(c, count);
        }

        symbols = sortByValue(symbols);


        for (Map.Entry<Character, Integer> s : symbols.entrySet()) {
            Tree t = new Tree(s.getKey(), s.getValue());

        }
        
        return "";
    }

    public static Map<Character, Integer> sortByValue(final Map<Character, Integer> lettersCounts) {
        return lettersCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<Character, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
