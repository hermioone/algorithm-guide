package org.hermione.chp1;

import java.util.Stack;

/**
 * 如何仅用递归函数和栈操作逆序一个栈
 * @author: hermione
 * @date: 2021年04月09日 8:38
 */
public class StackReverse {

    private int removeLastElement(Stack<Integer> stack) {
        int ele = stack.pop();
        if (stack.isEmpty()) {
            return ele;
        }
        int ret = removeLastElement(stack);
        stack.push(ele);
        return ret;
    }

    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int ele = removeLastElement(stack);
        reverseStack(stack);
        stack.push(ele);
    }
}
