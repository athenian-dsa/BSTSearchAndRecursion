import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testSearch() {
        BSTSearch bst = new BSTSearch();
        Node node10 = new Node(10);
        Node node2 = new Node(2);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        Node node3 = new Node(3);
        Node node6 = new Node(6);
        Node node11 = new Node(11);
        Node node13 = new Node(13);
        Node node12 = new Node(12);
        bst.root = node7;
        node7.left = node3;
        node3.left = node2;
        node3.right = node6;
        node6.left = node5;
        node7.right = node10;
        node10.right = node12;
        node12.left = node11;
        node12.right = node13;
        assertTrue(bst.search(7));
        assertTrue(bst.search(6));
        assertTrue(bst.search(11));
        assertTrue(bst.search(13));
        assertFalse(bst.search(1));
        assertFalse(bst.search(4));
        assertFalse(bst.search(15));
        assertFalse(bst.search(100));
    }

    @Test
    public void testFib() {
        assertEquals(1, BSTSearch.fib(1));
        assertEquals(1, BSTSearch.fib(2));
        assertEquals(2, BSTSearch.fib(3));
        assertEquals(3, BSTSearch.fib(4));
        assertEquals(5, BSTSearch.fib(5));
        assertEquals(8, BSTSearch.fib(6));
    }

    @Test
    public void testSumDigits() {
        assertEquals(6, BSTSearch.sumDigits(123));
        assertEquals(5, BSTSearch.sumDigits(5));
        assertEquals(20, BSTSearch.sumDigits(5537));
    }
}