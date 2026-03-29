class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new LinkedList<>();
        int[]result=new int[nums.length-k+1];
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && i-k==dq.peekFirst()){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.offerLast(i);

            if(i>=k-1){
                result[r++]=nums[dq.peekFirst()];
            }
        }
        return  result;
    }
}
