package Lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception
    {
        System.out.println("\nReading from One Expression...");
        ReadExpressionsFromFile("src/Lab4/one_expression.txt");
        System.out.println("\nReading from Three Expressions...");
        ReadExpressionsFromFile("src/Lab4/three_expressions.txt");
    }

    public static void ReadExpressionsFromFile(String path) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        do
        {
            var str = reader.readLine();
            if(str == null) break;
            System.out.println("\nFound expression: " + str);
            System.out.println("Expression - " + CheckBrackets(str));
        }while(true);
    }
    public static String CheckBrackets(String expr)
    {
        Stack<Character> curStack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char curChar = expr.charAt(i);
            if (curChar == '{' || curChar == '(' || curChar == '[')
            {
                curStack.push(curChar);
            }
            else if (curChar == '}' || curChar == ')' || curChar == ']')
            {
                if (curStack.isEmpty())
                    return "Incorrect!";

                char lastChar = curStack.peek();

                if (curChar == '}' && lastChar == '{' || curChar == ')' && lastChar == '(' || curChar == ']' && lastChar == '[')
                    curStack.pop();
                else return "Incorrect!";
            }
        }
        if(curStack.isEmpty()) return "Correct!";
        else return "Incorrect!";
    }
}