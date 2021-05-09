package de.hfu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {
	@Test
	public void queueTest() {
		Queue a = new Queue(3);
		a.enqueue(1);
		a.enqueue(3);
		a.enqueue(5);
		a.enqueue(10); //a letzter index wert wird überschrieben - von 5 -> 10
		assertEquals(a.queue[0], 1);
		assertEquals(a.queue[1], 3);
		assertEquals(a.queue[2], 10);
		
		assertEquals(a.dequeue(), 1);
		assertEquals(a.dequeue(), 3);
		assertEquals(a.dequeue(), 10);
	}
}
