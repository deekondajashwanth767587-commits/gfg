import java.util.*;

class Solution {
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        
        // Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] disc = new int[V];        // discovery time
        int[] low = new int[V];         // lowest reachable time
        int[] parent = new int[V];      // parent in DFS tree
        int[] childCount = new int[V];  // number of DFS children
        int[] itIndex = new int[V];     // iterator index for neighbors
        boolean[] ap = new boolean[V];  // articulation points

        Arrays.fill(parent, -1);

        int time = 1;
        Deque<Integer> stack = new ArrayDeque<>();

        // Handle disconnected graph
        for (int start = 0; start < V; start++) {
            if (disc[start] != 0) continue;

            stack.push(start);

            while (!stack.isEmpty()) {
                int u = stack.peek();

                // First time visit
                if (disc[u] == 0) {
                    disc[u] = low[u] = time++;
                }

                // Process neighbors
                if (itIndex[u] < adj.get(u).size()) {
                    int v = adj.get(u).get(itIndex[u]++);

                    if (v == parent[u]) continue;

                    if (disc[v] == 0) {
                        parent[v] = u;
                        childCount[u]++;
                        stack.push(v);
                    } else {
                        low[u] = Math.min(low[u], disc[v]);
                    }

                } else {
                    // Backtracking
                    stack.pop();
                    int p = parent[u];

                    if (p == -1) {
                        // Root node
                        if (childCount[u] > 1) ap[u] = true;
                    } else {
                        low[p] = Math.min(low[p], low[u]);

                        if (parent[p] != -1 && low[u] >= disc[p]) {
                            ap[p] = true;
                        }
                    }
                }
            }
        }

        // Collect result
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (ap[i]) ans.add(i);
        }

        if (ans.isEmpty()) ans.add(-1);
        return ans;
    }
}