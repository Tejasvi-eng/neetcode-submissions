class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []sol=new int[k];
        for(int x: nums){
            //count number of occurences
            map.put(x,map.getOrDefault(x,0)+1);
        }
      // Create array of Lists — index = frequency, value = numbers with that frequency
List<Integer>[] bucket = new ArrayList[nums.length + 1];

// Initialize each bucket
for(int i = 0; i < bucket.length; i++){
    bucket[i] = new ArrayList<>();
}

// Fill buckets — key is number, value is its frequency
for(int key : map.keySet()){
    bucket[map.get(key)].add(key);
}
int idx = 0;
for(int i = bucket.length - 1; i >= 0 && idx < k; i--){
    for(int num : bucket[i]){    // loop through list at this frequency
        sol[idx] = num;
        idx++;
        if(idx == k) break;      // stop when we have k elements
    }
}
return sol;
    }
}
