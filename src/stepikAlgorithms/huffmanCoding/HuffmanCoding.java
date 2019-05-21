/*
	Задача на программирование: кодирование Хаффмана
	По данной непустой строке 𝑠 длины не более 10^4, состоящей из строчных букв латинского алфавита,
	постройте оптимальный беспрефиксный код. В первой строке выведите количество различных букв 𝑘,
	встречающихся в строке, и размер получившейся закодированной строки. В следующих 𝑘 строках
	запишите коды букв в формате "letter: code". В последней строке выведите закодированную строку.
 */
package stepikAlgorithms.huffmanCoding;

import java.util.*;

public class HuffmanCoding {
	public String encode(String sourceStr) {
		Map<Character, Integer> count = new HashMap<>();

		for (Character c : sourceStr.toCharArray()) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else	 {
				count.put(c, 1);
			}
		}

		Map<Character, Node> charNodes = new HashMap<>();
		PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			Node node = new LeafNode(entry.getKey(), entry.getValue());
			priorityQueue.add(node);
			charNodes.put(entry.getKey(), node);
		}

		while (priorityQueue.size() > 1) {
			Node first = priorityQueue.poll();
			Node second = priorityQueue.poll();

			priorityQueue.add(new InternalNode(first, second));
		}

		Node root = priorityQueue.poll();
		if (count.size() == 1) {
			root.buildcode("0");
		} else {
			root.buildcode("");
		}

		StringBuilder strBuilder = new StringBuilder();
		for (Character c : sourceStr.toCharArray()) {
			strBuilder.append(charNodes.get(c).code);
		}

		return strBuilder.toString();
	}
}
