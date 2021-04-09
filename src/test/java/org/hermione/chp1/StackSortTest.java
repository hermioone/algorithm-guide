package org.hermione.chp1;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackSortTest {

    private StackSort stackSort;

    @Before
    public void init() {
        this.stackSort = new StackSort();
    }

    @Test
    public void test1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(8);
        stack.push(9);

        stackSort.sort(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

}