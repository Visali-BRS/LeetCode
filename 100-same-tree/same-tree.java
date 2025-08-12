public class Same_Tree {

    public class Solution_iteration {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null) {
                return q == null;
            }

            if (q == null) {
                return p == null;
            }

            Stack<TreeNode> sk1 = new Stack<TreeNode>();
            Stack<TreeNode> sk2 = new Stack<TreeNode>();

            sk1.push(p);
            sk2.push(q);

            while (!sk1.isEmpty() && !sk2.isEmpty()) {
                TreeNode current1 = sk1.pop();
                TreeNode current2 = sk2.pop();

                if (current1 == null && current2 == null) {
                    continue; // @note: missed both null check
                } else if (current1 == null && current2 != null) {
                    return false;
                } else if (current1 != null && current2 == null) {
                    return false;
                } else if (current1.val != current2.val) {
                    return false;
                }

                sk1.push(current1.left);
                sk2.push(current2.left);

                sk1.push(current1.right);
                sk2.push(current2.right);

            }

            // final check
            if (!sk1.isEmpty() || !sk2.isEmpty()) {
                return false;
            }

            return true;

        }
    }


    public class Solution_recursion {
        public boolean isSameTree(TreeNode p, TreeNode q) {

            if (p == null) {
                return q == null;
            }

            if (q == null) {
                return p == null;
            }

            if (p.val != q.val) {
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}



class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}