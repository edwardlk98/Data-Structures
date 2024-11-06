public class CalculatorHelper {

    /**
     * Converts an Infix expression to Postfix and returns it.
     * @param exp - Infix expression to be converted.
     * @return - Returns converted Postfix expression.
     */
    public static String infixToPostfix(String exp) {

        String result = new String("");

        String[] inputs = exp.split(" ");
        
        // You need to have your stack implemented for this line to work. "
         Stack<String> stack = new Stack<String>();        

        for (int i = 0; i < inputs.length; i++) {          
            String o = inputs[i].trim();

            if (o.equals("")) {
                continue;
            } else if (isNumeric(o)) {
                result += o + " ";
            } else if (o.equals("(")) {             
                stack.push(o);
            } else if (o.equals(")")) {              
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result += stack.peek() + " ";
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(o) <= precedence(stack.peek())) {
                    result += stack.peek() + " ";
                    stack.pop();
                }
                stack.push(o);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek().equals("(")) {
                return "Not Valid...";
            }
            result += stack.peek() + " ";
            stack.pop();
        }

        return result;
    }

    /**
     * Returns true if input parameter val is numeric.
     * @param val - The value to be checked.
     * @return - Returns true if val is numeric.
     */
    public static boolean isNumeric(String val) {
        try {
            Double.parseDouble(val);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static int precedence(String ch) {
        if (ch.equals("^")) {
            return 10;
        } else if (ch.equals("*") || ch.equals("/")) {
            return 8;
        } else if (ch.equals("+") || ch.equals("-")) {
            return 6;
        }
        return -1;
    }

    public static void main(String[] args) {
        String exp = "( 3 * 4 - ( 2 + 5 ) ) * 4 / 2";

        System.out.println(infixToPostfix(exp));
    }
}