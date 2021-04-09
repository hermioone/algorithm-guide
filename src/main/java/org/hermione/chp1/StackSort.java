package org.hermione.chp1;

import java.util.Stack;

/**
 * 核心思想：
 *  1. 从待排序的stack中pop数据（ele）
 *  2. 将pop出的数据和辅助的stack的栈顶元素比较
 *  3. 如果stack的peek大于ele，则将辅助stack的栈顶元素出栈，然后push到待排序的stack
 *  4. 重复步骤3，直到辅助stack的栈顶元素小于等于ele，则将ele压入辅助的stack中
 *  5. 重复上面的步骤1-步骤4，直到待排序的stack为空
 *  6. 将辅助的stack中的元素依次出栈，然后push到待排序的stack中
 */
public class StackSort {
    private final Stack<Integer> help = new Stack<>();

    /**
     * 使用递归实现，主要是锻炼自己的递归思维
     */
    public void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            // 如果stack为空，说明所有数据都已排好序存在help中，将help中的元素依次出栈，然后push到stack中
            while (!help.isEmpty()) {
                stack.push(help.pop());
            }
            return;
        }
        int ele = stack.pop();
        while (!help.isEmpty() && help.peek() > ele) {
            // 将help的栈定元素出栈并压入stack中，直到 ele <= help 的栈顶元素，说明ele到了help中的合适的位置
            stack.push(help.pop());
        }
        help.push(ele);
        sort(stack);
    }
}
