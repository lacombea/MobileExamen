package com.example.drawertest;

import java.util.Stack;

public class CalculiClass {

    /*public static void main(String[] args) {

        String str = "3*5+(4+8/1)";

        //	split(str);

        System.out.println(Calcul.evaluate(str));
    }*/


    public static int evaluate(String str) {

        char[] index = str.toCharArray();

        Stack<Integer> val = new Stack<Integer>();

        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < index.length; i++) {

            if (index[i] == ' ') {
                continue;
            }
            if (index[i] >= '0' && index[i] <= '9') {
                StringBuffer stringBuffer = new StringBuffer();

                while (i < index.length &&
                        index[i] >= '0' &&
                        index[i] <= '9')
                    stringBuffer.append(index[i++]);
                val.push(Integer.parseInt(stringBuffer.toString()));
                i--;
            } else if (index[i] == '(') {
                operators.push(index[i]);
            }

            else if (index[i] == ')')
            {
                while (operators.peek() != '(')
                    val.push(applyOp(operators.pop(),
                            val.pop(),
                            val.pop()));
                operators.pop();
            }

            else if (index[i] == '+' ||
                    index[i] == '-' ||
                    index[i] == '*' ||
                    index[i] == '/')
            {
                while (!operators.empty() &&
                        hasPrecedence(index[i],
                                operators.peek()))
                    val.push(applyOp(operators.pop(),
                            val.pop(),
                            val.pop()));

                operators.push(index[i]);
            }
        }

        while (!operators.empty())
            val.push(applyOp(operators.pop(),
                    val.pop(),
                    val.pop()));

        return val.pop();
    }

    public static boolean hasPrecedence(
            char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') &&
                (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char op,
                              int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException(
                            "Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static char[] split(String str) {
        char[] calcul = new char[str.length()];
        String[] inter = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            calcul[i] = str.charAt(i);
            if(calcul[i]=='(') {
                while(calcul[i+1]!=')') {
                    System.out.println(calcul[i]);
                    i++;
                }
            }
        }
        return calcul;
    }

}