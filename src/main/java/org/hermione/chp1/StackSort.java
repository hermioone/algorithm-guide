package org.hermione.chp1;

import java.util.Stack;

public class StackSort {
    private final Stack<Integer> help = new Stack<>();

    public void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            while (!help.isEmpty()) {
                stack.push(help.pop());
            }
            return;
        }
        int ele = stack.pop();
        while (!help.isEmpty() && help.peek() > ele) {
            stack.push(help.pop());
        }
        help.push(ele);
        sort(stack);
    }
}
