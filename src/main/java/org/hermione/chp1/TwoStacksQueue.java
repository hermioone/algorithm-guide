package org.hermione.chp1;

import java.util.Stack;

/**
 * 题目：由两个栈组成的队列
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add，pool，peek）
 *
 * @author: hermione
 * @date: 2021年04月06日 22:13
 */
public class TwoStacksQueue {
    private Stack<Integer> stackPush = new Stack<>();
    private Stack<Integer> stackPop = new Stack<>();


    public void add(int num) {
        stackPush.push(num);
    }

    public int poll() {
        if (stackPop.isEmpty()) {
            pushToPop();
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.isEmpty()) {
            pushToPop();
        }
        return stackPop.peek();
    }

    private void pushToPop() {
        // 只有当 stackPop 为空时，才能把 stackPush 中的数据push到 stackPop 中
        // 且必须将 stackPush 中的所有数据都push到 stackPush 中
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }
}
