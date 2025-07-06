class FindSumPairs {

    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> m1 = new HashMap<>();
    Map<Integer, Integer> m2 = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int num1: nums1){
            m1.put(num1, m1.getOrDefault(num1, 0) + 1);
        }

        for(int num2: nums2){
            m2.put(num2, m2.getOrDefault(num2, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int currVal = nums2[index];
        int cnt = m2.get(currVal);
        if(cnt == 1){
            m2.remove(currVal);
        } else {
            m2.put(currVal, cnt - 1);
        }
        nums2[index] = nums2[index] + val;
        currVal = nums2[index];
        m2.put(currVal, m2.getOrDefault(currVal, 0) + 1);
    }
    
    public int count(int tot) {
        int count = 0;
        // int m = nums1.length;
        // int n = nums2.length;
        // for(int i = 0 ; i < m; i ++){
        //     for(int j = 0 ; j < n; j++){
        //         if(nums1[i] + nums2[j] == tot){
        //             count++;
        //         }
        //     }
        // }

        for(Map.Entry<Integer, Integer> entry : m1.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            int diff = tot - key;
            if(m2.containsKey(diff)){
                count += (val * m2.get(diff));
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */