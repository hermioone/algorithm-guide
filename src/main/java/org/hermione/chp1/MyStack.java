package org.hermione.chp1;

import java.util.Stack;

/**
 * 题目：设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，在实现返回栈中最小元素的操作
 * 要求：
 *  1. pop，push，getMin操作的时间复杂度都是 O(1)
 * @author: hermione
 * @date: 2021年04月06日 22:00
 */
public class MyStack {

    /**
     * 每次push数据的时候，都把数据push到datas中
     */
    private Stack<Integer> datas = new Stack<>();
    /**
     * 每次push数据的时候，把当前步骤完成后，datas中的最小值push尽minDatas中
     */
    private Stack<Integer> mins = new Stack<>();

    public void push(int num) {
        datas.push(num);
        if (mins.isEmpty()) {
            mins.push(num);
            return;
        }
        int min = Math.min(num, mins.peek());
        mins.push(min);
    }

    public int pop() {
        mins.pop();
        return datas.pop();
    }

    public int getMin() {
        return mins.peek();
    }
}
