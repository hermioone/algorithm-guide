package org.hermione.chp1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: hermione
 * @date: 2021年04月06日 22:08
 */

public class MyStackTest {

    private MyStack stack;

    @Before
    public void init() {
        stack = new MyStack();
    }

    @Test
    public void testCase1() {
        stack.push(3);
        stack.push(4);
        Assert.assertEquals(3, stack.getMin());
        stack.push(5);
        stack.push(1);
        Assert.assertEquals(1, stack.getMin());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(3, stack.getMin());
        stack.push(2);
        stack.push(1);
        Assert.assertEquals(1, stack.getMin());
    }

}
