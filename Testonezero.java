package newproject;
import java.util.*;


public class Testonezero {
   
    public static String multiple(int num) {
       
        String result = "0";

        if (num > 0) {
            // An array to mark all the visited nodes
        	// num is the array size
            boolean[] visit = new boolean[num];
            Arrays.fill(visit, false);

            // The queue used by BFS
            Queue<Node> queue = new ArrayDeque<>();

            // Add the first number 1 and mark it visited
            queue.add(new Node(true, 1 % num, null));
            visit[1 % num] = true;
            
            // The final destination node which represents the answer
            Node destNode = null;

            while (!queue.isEmpty()) {
                // Get the next node from the queue
                Node currNode = queue.remove();
                
                
                System.out.println(currNode.val);
                if (currNode.val == 0) {
                    // We have reached a valid multiple of num
                    destNode = currNode;
                    break;
                } else {
                    // Visit the next 2 neighbors
                    // Append 0 - (currNode.val * 10)
                    // Append 1 - (currNode.val * 10) + 1

                    // Append a '0'
                    int val1 = (currNode.val * 10) % num;
                    if (!visit[val1]) {
                        queue.add(new Node(false, val1, currNode));
                        visit[val1] = true;
                    }

                    // Append a '1'
                    int val2 = (val1 + 1) % num;
                    if (!visit[val2]) {
                        queue.add(new Node(true, val2, currNode));
                        visit[val2] = true;
                    }
                }
            }

            // Trace the path from destination to source
            if (destNode == null) {
                throw new IllegalStateException("Result should not be null");
            } else {
                StringBuilder reverseResultBuilder = new StringBuilder();
                Node currNode = destNode;
                while (currNode != null) {
                    reverseResultBuilder.append(currNode.isDigitOne ? '1' : '0');
                    currNode = currNode.parent;
                }
                result = reverseResultBuilder.reverse().toString();
            }
        }

        return result;
    }

    // Node represents every digit being appended in the decision tree
    private static class Node {
        // True if '1', false otherwise (i.e. '0')
        public final boolean isDigitOne;
        // The number represented in the tree modulo the input number
        public final int val;
        // The parent node in the tree
        public final Node parent;

        public Node(boolean isDigitOne, int val, Node parent) {
            this.isDigitOne = isDigitOne;
            this.val = val;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		System.out.print("Enter the number :");
        int num = input.nextInt();
        
        System.out.println("Smallest multiple having 0 and 1 digits is: " + Testonezero.multiple(num));
    }
}