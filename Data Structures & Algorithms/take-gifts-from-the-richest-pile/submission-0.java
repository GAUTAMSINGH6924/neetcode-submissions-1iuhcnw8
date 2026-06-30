class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int gift:gifts){
            pq.add(gift);
        }

        for(int i=0;i<k;i++){
            int n=pq.poll();

            pq.add((int)Math.floor(Math.sqrt(n)));
        }
        long ans=0;
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
}