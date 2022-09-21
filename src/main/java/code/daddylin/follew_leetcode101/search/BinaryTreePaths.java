package code.daddylin.follew_leetcode101.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {

        List<Integer> path = new LinkedList<>();
        List<String> paths = new ArrayList<>();
        dfs(root, new StringBuilder(), paths);

        return paths;
    }

    private void dfs(TreeNode node, StringBuilder builder, List<String> paths) {
        int length = builder.length();
        if (length >= 1) {
            builder.append("->");
        }
        builder.append(node.val);
        if (node.left == null && node.right == null) {
            paths.add(builder.toString());
            builder.delete(length , builder.length());
            return;
        }

        if (node.left != null) {
            dfs(node.left, builder, paths);
        }
        if (node.right != null) {
            dfs(node.right, builder, paths);
        }
        builder.delete(length , builder.length());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        System.out.println(new BinaryTreePaths().binaryTreePaths(root));
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

