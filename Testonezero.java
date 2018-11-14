package Trainingjava;
import java.util.*;


public class Testonezero {
   
    public static String multiple(int num) {
       
        String result = "0";

        if (num > 0) {
            // An array to mark all the visited nodes
            boolean[] visit = new boolean[num];
            Arrays.fill(visit, false);

           
            Queue<Node> queue = new ArrayDeque<>();

            
            queue.add(new Node(true, 1 % num, null));
            visit[1 % num] = true;

            
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

            // StringBuilder objects can be modified
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

    // Node means digits appended
    private static class Node {
        
        public final boolean isDigitOne;
        
        public final int val;
        
        public final Node parent;

        public Node(boolean isDigitOne, int val, Node parent) {
            this.isDigitOne = isDigitOne;
            this.val = val;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
    	Scanner ss = new Scanner(System.in);
		System.out.print("Enter i :");
        int num = ss.nextInt();
        
        System.out.println("Smallest multiple using only 0s and 1s as digits: " + Testonezero.multiple(num));
    }
}