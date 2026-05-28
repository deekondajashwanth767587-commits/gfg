class Solution {

    TreeMap<Integer, Integer> map = new TreeMap<>();

    public ArrayList<Integer> verticalSum(Node root) {

        dfs(root, 0);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer val : map.values()) {
            result.add(val);
        }

        return result;
    }

    public void dfs(Node root, int hd) {

        if (root == null) {
            return;
        }

        map.put(hd, map.getOrDefault(hd, 0) + root.data);

        dfs(root.left, hd - 1);

        dfs(root.right, hd + 1);
    }
}