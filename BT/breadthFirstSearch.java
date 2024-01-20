import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
          this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        bfs(root);
    }
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);

        while(q.isEmpty() == false)
        {
            Node temp = q.peek();
            if(temp.left != null)
                q.add(temp.left);
            
            if(temp.right != null)
                q.add(temp.right);

            System.out.println(temp.val + " ");
            q.remove();
        }
    }
}
