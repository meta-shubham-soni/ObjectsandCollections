public class Stack {
	public int stack[], index;

	public Stack() {
		stack = new int[100];
		index = -1;
	}

	/*
	 * Push Elements in Stack
	 * 
	 * @Param x Value to be Pushed
	 */
	public void push(int x) {
		stack[index + 1] = x;
		index++;
	}

	/*
	 * Pop Element from the Stack
	 * 
	 * @return Popped Element
	 */

	public int pop() {
		if (index == -1) {
			return -1;
		}
		int num = stack[index];
		index--;
		return num;
	}

	/*
	 * Current Position of Index in Stack
	 * 
	 * @return value at index
	 */
	public int peek() {
		if (index == -1) {
			return 0;
		}
		return stack[index];
	}

}