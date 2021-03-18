import java.util.HashMap;
import java.util.Map;


public class Functions {
	static Map<String, Long> m1 = new HashMap<>();
	
	/*
	 * Function to Calculate Unique Characters
	 * @Param s String 
	 */
	public static long Calc(String s) {
		if (s == null) {
			throw new AssertionError("Empty String");
		}
		if (m1.get(s) == null) {
			long c1 = s.chars().distinct().count();
			m1.put(s, c1);
			return c1;

		} else {
			long c1 = m1.get(s);
			return c1;
		}
	}
	
	/*
	 * Evaluation of Molecule
	 * @param s String
	 * @return Molecular Weight of Molecule
	 */
	public static int evaluate(String s) {
		Stack s1 = new Stack();
		if (s == null)
			throw new AssertionError("Empty String");
		int ans = 0;
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
				num = s1.pop();
				num *= Integer.parseInt(String.valueOf(c));
				s1.push(num);
				break;
			case 'C':
				s1.push(12);
				break;
			case 'H':
				s1.push(1);
				break;
			case 'O':
				s1.push(16);
				break;
			case '(':
				s1.push(0);
				break;
			case ')':
				int result = 0;
				while (s1.peek() != 0) {
					result += s1.pop();
				}
				int throwaway = s1.pop();
				s1.push(result);
				break;
			default:
				break;

			}
		}
		for (int i = 0; s1.index > -1; i--) {
			ans += s1.pop();
		}
		return ans;
	}
}
