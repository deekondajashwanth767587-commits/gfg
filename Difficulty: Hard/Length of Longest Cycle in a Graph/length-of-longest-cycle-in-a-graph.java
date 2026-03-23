import java.util.*;

class Solution {
    public int longestCycle(int V, int[][] edges) {
        int[] next = new int[V];
        Arrays.fill(next, -1);

        for (int[] e : edges) {
            next[e[0]] = e[1];
        }

        boolean[] visited = new boolean[V];
        int max = -1;

        for (int i = 0; i < V; i++) {
            if (visited[i]) continue;

            Map<Integer, Integer> stepMap = new HashMap<>();
            List<Integer> path = new ArrayList<>();

            int node = i;
            int step = 0;

            while (node != -1 && !visited[node]) {

                if (stepMap.containsKey(node)) {
                    int cycleLength = step - stepMap.get(node);
                    max = Math.max(max, cycleLength);
                    break;
                }

                stepMap.put(node, step);
                path.add(node);

                step++;
                node = next[node];
            }

            // mark all nodes in this traversal as visited
            for (int n : path) {
                visited[n] = true;
            }
        }

        return max;
    }
}