/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

import java.util.*;

class Solution {

    HashMap<Integer, Integer> prePos = new HashMap<>();
    HashMap<Integer, Integer> mirrorPos = new HashMap<>();

    private Node build(int[] pre, int[] mirror,
                       int ps, int pe,
                       int ms, int me) {

        if (ps > pe)
            return null;

        Node root = new Node(pre[ps]);

        // Leaf node
        if (ps == pe)
            return root;

        int leftRoot = pre[ps + 1];
        int rightRoot = mirror[ms + 1];

        int rightPos = prePos.get(rightRoot);

        int leftSize = rightPos - ps;

        root.left = build(pre, mirror,
                          ps + 1,
                          ps + leftSize - 1,
                          mirrorPos.get(leftRoot),
                          me);

        root.right = build(pre, mirror,
                           ps + leftSize,
                           pe,
                           ms + 1,
                           mirrorPos.get(rightRoot));

        return root;
    }

    public Node constructBinaryTree(int[] pre, int[] preMirror) {

        int n = pre.length;

        for (int i = 0; i < n; i++) {
            prePos.put(pre[i], i);
            mirrorPos.put(preMirror[i], i);
        }

        return build(pre, preMirror, 0, n - 1, 0, n - 1);
    }
}