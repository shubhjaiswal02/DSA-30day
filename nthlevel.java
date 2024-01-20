public class nthlevel {
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
        int level = height(root);
        for (int i = 1; i <= level; i++) {
            levelprint(root, i);
            System.out.println();
        }
    }
    public static int height(Node root){
        if (root == null ) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void levelprint(Node root, int n){
        if(root == null) return;
        if(n == 1) System.out.print(root.val);
        levelprint(root.left, n-1);
        levelprint(root.right, n-1);
    }
}
