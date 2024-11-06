import java.util.*;
public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression;
        Stack<Float> stack = new Stack<>();
        do{
            System.out.println("Enter an infix expression (q to quit): ");
            expression = input.nextLine();
            
            String postfix = CalculatorHelper.infixToPostfix(expression);
            System.out.println("This is the post fix: " + postfix);
            String [] tokens = postfix.split(" ");
            
            for(int i = 0; i< tokens.length; i++){
                String token = tokens[i];
                
                if (token == "") {
                    continue;
                }
                
                if (CalculatorHelper.isNumeric(String.valueOf(token))) {
                    stack.push(Float.parseFloat(token));
                }
                else{
                    float operandtwo = stack.pop();
                    float operandone = stack.pop();
                    float result = Calculate(operandone, operandtwo, token.charAt(0)); 
                    stack.push(result); 
                }
                
input.close();
        }
        System.out.println("The result of the postfix expression is: " + stack.pop());
    }
        while (!expression.equalsIgnoreCase("q")) ;
        
    }
    private static float Calculate(float operandone, float operandtwo, char operator) {
        switch (operator) {
            case '+':
                return operandone + operandtwo;
            case '-':
                return operandone - operandtwo;
            case '*':
                return operandone * operandtwo;
            case '/':
                if (operandtwo == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return operandone / operandtwo;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
            
}
