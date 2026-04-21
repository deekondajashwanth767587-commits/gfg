class Solution {

    // Function to calculate GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Simulate pouring from one jug to another
    static int pour(int fromCap, int toCap, int d) {
        int from = fromCap;  // fill from jug
        int to = 0;          // to jug empty
        int step = 1;        // first fill

        while (from != d && to != d) {

            // pour water
            int transfer = Math.min(from, toCap - to);
            to += transfer;
            from -= transfer;
            step++;

            // check if we got d
            if (from == d || to == d)
                break;

            // if from becomes empty → fill again
            if (from == 0) {
                from = fromCap;
                step++;
            }

            // if to becomes full → empty it
            if (to == toCap) {
                to = 0;
                step++;
            }
        }

        return step;
    }

    // Main function
    public int minSteps(int m, int n, int d) {

        // Step 1: feasibility check
        if (d > Math.max(m, n))
            return -1;

        if (d % gcd(m, n) != 0)
            return -1;

        // Step 2: try both directions
        return Math.min(
            pour(m, n, d),
            pour(n, m, d)
        );
    }
}