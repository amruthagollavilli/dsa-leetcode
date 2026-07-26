class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int n= nums[i];
            if(map.containsKey(n)){
                map.put(n,map.getOrDefault(n, 0)+1);
            }
            else{
    map.put(n, 1);
}
        }
        // Max Heap based on frequency
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Add all numbers to heap
        pq.addAll(map.keySet());

        int[] result = new int[k];

        // Extract top k frequent elements
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;

    }
}