class Solution {
    public int minSwaps(int[] arr) {
        int result = 0;
        int freq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) freq++;
        }

        if (freq == 0) return -1;

        int window = 0;
        int left = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            window++;
            if (arr[i] == 1) count1++;

            if (window > freq) {
                if (arr[left] == 1) count1--; // update only if needed
                left++;                       // ALWAYS move left
                window--;
            }

            if (window == freq) {
                result = Math.max(result, count1);
            }
        }

        return freq - result;
    }
}