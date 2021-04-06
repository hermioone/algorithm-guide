package org.hermione.chp1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: hermione
 * @date: 2021年04月06日 22:22
 */
public class TwoStacksQueueTest {

    private TwoStacksQueue queue;

    @Before
    public void setUp() {
        this.queue = new TwoStacksQueue();
    }

    @Test
    public void testCase1() {
        queue.add(5);
        queue.add(4);
        queue.add(3);
        Assert.assertEquals(5, queue.peek());
        Assert.assertEquals(5, queue.poll());
        Assert.assertEquals(4, queue.poll());
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(1);
        Assert.assertEquals(3, queue.poll());
        Assert.assertEquals(6, queue.poll());
        Assert.assertEquals(7, queue.poll());
        Assert.assertEquals(8, queue.poll());
        Assert.assertEquals(1, queue.poll());
    }
}