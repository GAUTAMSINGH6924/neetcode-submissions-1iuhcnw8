class Solution {
    public int binarySearch(int[] nums,int s,int e,int target){
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int pivot=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<nums.length-1 &&nums[mid]>nums[mid+1]){
                pivot=mid;
                break;
            }
            else if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        int ans=-1;
        if(pivot==-1){
            ans=binarySearch(nums,0,nums.length-1,target);
        }
        else if(target >=nums[0] && target<=nums[pivot]){
            ans=binarySearch(nums,0,pivot,target);
        }
        else if(target >=nums[pivot+1] && target<=nums[nums.length-1]){
            ans=binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return ans;
    }
}
