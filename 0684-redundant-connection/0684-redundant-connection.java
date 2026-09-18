class Solution {
    static int[] parent, size;

    int leader(int a) {
        if (parent[a] == a) return a;
        return parent[a] = leader(parent[a]); 
    }

    void union(int u, int v) {
        int a = leader(u);
        int b = leader(v);
        if (a == b) return;
        if (size[a] > size[b]) {
            parent[b] = a;
            size[a] += size[b];
        } else {
            parent[a] = b;
            size[b] += size[a];
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int[] arr : edges) {
            int u = arr[0];
            int v = arr[1];
            if (leader(u) == leader(v)) {
                return new int[]{u, v};
            }
            union(u, v);
        }
        return new int[0];
    }
}