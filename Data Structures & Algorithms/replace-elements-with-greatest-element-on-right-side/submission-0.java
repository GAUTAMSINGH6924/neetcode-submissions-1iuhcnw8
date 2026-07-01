class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax=-1;
        int []result=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            result[i]=rightMax;
            rightMax=Math.max(rightMax,arr[i]);
        }
        return result;
    }
}