package com.daniyar.bracket_task_3;

import java.util.Stack;

//3.Разработай программу для проверки корректности скобочной последовательности.
// Создайте метод isBracketSequenceValid, который принимает строку, содержащую
// только скобки (, ), {, }, [ и ], и возвращает true, если скобочная
// последовательность корректна, и false в противном случае. Для проверки
// используй Stack. Пример: для строки "{[()]}" метод должен вернуть true,
// а для строки "{[(])}" - false.

public class BracketController {
    private boolean isBracketRight = true;

    public boolean isBracketSequenceValid(String str) {
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stk.push(String.valueOf(str.charAt(i)));
        }

        while (!stk.isEmpty()) {
            int count = 0;
            if (!isBracketsComparable(stk.firstElement(), stk.lastElement())) {
                return isBracketRight = false;
            }
            stk.pop();
            stk.remove(count);

        }
        return isBracketRight;
    }

    public boolean isBracketsComparable(String str1, String str2) {
        boolean bool;

        if (str1.equals("(") && str2.equals(")") ||
                str1.equals("{") && str2.equals("}") ||
                str1.equals("[") && str2.equals("]")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
