 static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length) {
            return 0;
        }
        Arrays.sort(c);
        int max = Math.max(c[0], (n-1) - c[c.length - 1]);
        for (int i = 0; i < c.length - 1; i++) {
            int temp = (c[i + 1] - c[i]) / 2;
            if (temp > max) {
                max = temp;
            }
        }

        return max;
