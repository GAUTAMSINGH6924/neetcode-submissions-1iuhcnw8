class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int e=numbers.length-1;

        while(s<=e){
            int num=numbers[s]+numbers[e];
            if(num>target){
                e--;
                continue;
            }
            if(num<target){
                s++;
                continue;
            }
            if(num==target){
                return new int[]{s+1,e+1};
            }
        }
        return new int[]{};
    }
}
