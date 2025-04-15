class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i ++){
            map.put(nums2[i], i);
        }
        int cnt = 0;
        for(int i = 0; i < n - 2; i++){
            if(map.containsKey(nums1[i])){
                int nums2i = map.get(nums1[i]);
                if(nums2i > n - 3){
                    continue;
                } else {
                    for(int j = i + 1; j < n - 1; j++){
                        if(map.containsKey(nums1[j])){
                            int nums2j = map.get(nums1[j]);
                            if(nums2i > n - 2){
                                continue;
                            } else {
                                for(int k = j + 1; k < n; k++){
                                    if(map.containsKey(nums1[k])){
                                        int nums2k = map.get(nums1[k]);
                                        if(nums2i < nums2j && nums2j < nums2k){
                                            cnt++;
                                        }
                                    }                                    
                                }
                            }                        
                        }
                    }
                }            
            }
        }
        return cnt;
    }
}