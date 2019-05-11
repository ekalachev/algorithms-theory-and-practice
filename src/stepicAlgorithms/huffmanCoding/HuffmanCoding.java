package stepicAlgorithms.huffmanCoding;

import java.util.*;
import java.util.Collections;

public class HuffmanCoding {
	public String encode(String sourceStr) {
		// find weight for each letter
		Map<Character, Integer> symbols = new HashMap<>();

		for (char c : sourceStr.toCharArray()) {
			int count = symbols.containsKey(c) ? symbols.get(c) : 0;

			count++;
			symbols.put(c, count);
		}

		List<Node> arr = mapToList(symbols);

		// sort by weight and create binary tree
		while (arr.size() > 1) {
			Collections.sort(arr, Comparator.comparing(Node::getWeight));

			Node l1 = arr.get(0);
			arr.remove(l1);

			Node l2 = arr.get(0);
			arr.remove(l2);

			Node p = new Node(' ', l1.getWeight() + l2.getWeight());

			p.left = l1;
			p.right = l2;

			arr.add(p);
		}

		// encode text by tree
		String result = "";
		Node tree = arr.get(0);

		for (char c : sourceStr.toCharArray()) {
			String code = search(tree, c);
			result += code;
		}

		return result;
	}

	private static String search(Node root, char letter) {
		return search(root, letter, root.left == null && root.right == null ? "0" : "");
	}
	
	private static String search(Node root, char letter, String result) {
		if(root == null)
			return "";
		
		if (root.letter == letter)
			return result;
		
		String newResult = search(root.left, letter, result + "0");
		newResult += search(root.right, letter, result + "1");
		
		return newResult;
	}

	private static List<Node> mapToList(final Map<Character, Integer> symbols) {
		List<Node> arr = new ArrayList<>();

		for (Map.Entry<Character, Integer> s : symbols.entrySet()) {
			arr.add(new Node(s.getKey(), s.getValue()));
		}

		return arr;
	}

//    private static Map<Character, Integer> sortByValue(final Map<Character, Integer> lettersCounts) {
//        return lettersCounts.entrySet()
//                .stream()
//                .sorted((Map.Entry.<Character, Integer>comparingByValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//    }
}
