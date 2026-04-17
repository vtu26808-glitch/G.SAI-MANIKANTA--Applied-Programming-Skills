class Solution {
    static class PointInfo implements Comparable<PointInfo> {
        int dist;
        int x;
        int y;

        PointInfo(int dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(PointInfo p2) {
            return this.dist-p2.dist;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<PointInfo> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int dist = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new PointInfo(dist, points[i][0], points[i][1]));
        }
        int ans[][] = new int[k][2];
        while (k > 0) {
            PointInfo curr = pq.remove();
            ans[k - 1][0] = curr.x;
            ans[k - 1][1] = curr.y;
            k -= 1;
        }
        return ans;
    }
}