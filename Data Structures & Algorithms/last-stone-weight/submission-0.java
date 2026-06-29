class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int stone:stones){
            pq.add(stone);
        }
        while(pq.size()>=2){
            int a=pq.poll();
            int b=pq.poll();

            if(a>b){
                int c=a-b;
                pq.add(c);
            }
            else if(a<b){
                int c=b-a;
                pq.add(c);
            }
        }

        return pq.size()==1?pq.poll():0;
    }
}
