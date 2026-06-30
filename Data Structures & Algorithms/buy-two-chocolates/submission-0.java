class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int price:prices){
            pq.offer(price);
        }

        int min1=pq.poll();
        int min2=pq.poll();
        int total=min1+min2;
        return money<total?money:money-total;
    }
}