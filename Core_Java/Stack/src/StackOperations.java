import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(60);
		s.push(30);
		s.push(45);
		s.push(50);
		System.out.println("Elements in the stack"+s);
		s.pop();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.contains(50);
		System.out.println("Element that contains the element"+s);
	}

}
