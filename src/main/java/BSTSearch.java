public class BSTSearch {
    // The BST keeps track of its root node
    Node root;

    // At the beginning, there are no nodes
    public BSTSearch() {
        this.root = null;
    }

    // Searches the BST for the given value.
    // Implement this using iteration, not recursion.
    public boolean search(int val) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }

    // Factorial Example
    // The factorial (!) of an integer x is the product
    // of x and all positive integers less than x
    // Ex. factorial(5) = 5 * 4 * 3 * 2 * 1 => 120
    public static int factorial(int x) {
        // Base case: 1! = 1
        if (x == 1) {
            return 1;
        }
        // Recursive call: x! = x * (x-1)!
        return x * factorial(x-1);
    }

    // Find the n-th fibonacci term.
    // The first two terms are both equal to 1,
    // that is fib(1) => 1, and fib(2) => 1
    // All other terms are equal to the sum of the
    // previous two terms
    public static int fib(int n) {
        // REPLACE WITH YOUR CODE HERE
        return -1;
    }
    // Adds up all the digits in a number
    // Recall that you can use % 10 to get the last digit
    public static int sumDigits(int num) {
        // REPLACE WITH YOUR CODE HERE
        return -1;
    }

    // A recursive version of the search() function above.
    public boolean searchRec(int val) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }
}

// Each node will have a data value as well
// as possibly a left and right child
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}