public class MaxPathSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        sum(root, max);
        return max[0];

    }

    public static int sum(TreeNode node, int[] max){
        if(node == null)
            return 0;

        int left = sum(node.left,max);
        int right = sum(node.right, max);

        int cur = Math.max(node.val, Math.max(node.val + left, node.val + right));
        max[0] = Math.max(max[0], Math.max(cur, left + node.val + right));
        return cur;
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
}
