/*
	Декодирование Хаффмана
	Восстановите строку по её коду и беспрефиксному коду символов. 
	В первой строке входного файла заданы два целых числа 𝑘 и 𝑙 через пробел — количество
	различных букв, встречающихся в строке, и размер получившейся закодированной строки,
	соответственно. В следующих 𝑘 строках записаны коды букв в формате "letter: code".
	Ни один код не является префиксом другого. Буквы могут быть перечислены в любом порядке.
	В качестве букв могут встречаться лишь строчные буквы латинского алфавита; каждая из этих букв
	встречается в строке хотя бы один раз. Наконец, в последней строке записана закодированная
	строка. Исходная строка и коды всех букв непусты. Заданный код таков, что закодированная строка
	имеет минимальный возможный размер.

	В первой строке выходного файла выведите строку 𝑠. Она должна состоять из строчных букв латинского
	алфавита. Гарантируется, что длина правильного ответа не превосходит 10^4 символов.
 */
package stepicAlgorithms.huffmanDecoding;

import java.util.*;

public class HuffmanDecoding {
	public String decode(Map<String, Character> dictionary, String encodedStr) {
		Queue<Character> queue = new LinkedList<>();
		
		for(char c: encodedStr.toCharArray()) {
			queue.add(c);
		}
		
		String result = "";		
		String encodedSymbol = "";
		
		while(!queue.isEmpty()) {
			encodedSymbol += queue.poll();
			
			Character symbol = dictionary.get(encodedSymbol);
			
			if(symbol != null) {
				encodedSymbol = "";
				result += symbol;
			}
		}
		
		return result;
	}
}
