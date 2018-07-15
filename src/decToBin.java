import java.util.Stack;
import java.util.Scanner;

public class decToBin {
	public static void decToBin(int num) {
		Stack<Integer> stack = new Stack<Integer>(); //declare stack. <Integer> requires java.util.Stack
		int binary;
		if (num > 0) {		//we're taking a number > 0. int type will truncate if 1/2
			binary = num%2;	//the mod by 2 is either 1 or 0
			stack.push(binary);
			decToBin(num/2);	//call again, but it gets halved until 1 or 0
		}
		while (!stack.isEmpty()) {		//pop out the binary numbers from top to bottom
			System.out.print(stack.pop());
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		decToBin(num);
	}

}
