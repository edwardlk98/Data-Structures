public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(24);

        System.out.println("\nThe stack has " + stack.size() + " elements.");

        System.out.println("\nThe contents of the stack are: " + getStackContents(stack));

        System.out.println("\nThe stack has " + stack.size() + " elements.");

        stack.push(50);
        stack.push(80);
        stack.push(24);
        stack.push(95);
        stack.push(98);
        System.out.println("\nCalling stack.peek() returned: " + stack.peek());

        System.out.println("\nThe stack has " + stack.size() + " elements.");

        stack.push(28);

        System.out.println("\nCalling stack.pop() returned: " + stack.pop());

        System.out.println("\nThe contents of the stack are: " + getStackContents(stack) + "\n");
    }

    private static String getStackContents(Stack<Integer> stack) {
        var result = "";
        while (stack.peek() != null) {
            result += stack.pop();
            
            if (stack.peek() != null) {
                result += ", ";
            }
        }
        return result;
    }
}
