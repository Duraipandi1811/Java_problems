import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    // Function to get precedence of an operator
    private static int getPrecedence(char op) {
        switch(op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        
        for(int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            // If character is an operand, add to output
            if(Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            // If '(', push to stack
            else if(c == '(') {
                stack.push(c);
            }
            // If ')', pop and output until '(' is encountered
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Input"; // Unmatched parenthesis
                } else {
                    stack.pop(); // Remove '(' from stack
                }
            }
            // If operator
            else if(isOperator(c)) {
                while(!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            } else {
                return "Invalid Input"; // Invalid character encountered
            }
        }
        
        // Pop all remaining operators from stack
        while(!stack.isEmpty()) {
            if(stack.peek() == '(') {
                return "Invalid Input"; // Unmatched parenthesis
            }
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the infix expression");
        String infix = scanner.nextLine().trim();
        
        String postfix = infixToPostfix(infix);
        if(postfix.equals("Invalid Input")) {
            System.out.println(postfix);
        } else {
            System.out.println("The postfix expression is");
            System.out.println(postfix);
        }
    }
}