class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i:arr){
            minheap.offer(i);
        
        if(minheap.size()>k)minheap.poll();
        if(minheap.size()<k)result.add(-1);
        else result.add(minheap.peek());
        }
        return result;
    }
}