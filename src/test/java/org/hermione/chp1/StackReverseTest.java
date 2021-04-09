package org.hermione.chp1;


import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

/**
 * @author: hermione
 * @date: 2021年04月09日 8:41
 */
public class StackReverseTest {

    private StackReverse stackReverse;

    @Before
    public void init() {
        this.stackReverse = new StackReverse();
    }

    @Test
    public void test1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        stackReverse.reverseStack(stack);

        System.out.println(stack);
    }

}