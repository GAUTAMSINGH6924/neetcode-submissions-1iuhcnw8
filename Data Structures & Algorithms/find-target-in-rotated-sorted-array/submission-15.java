class Solution {
    public int findPivot(int[]nums){
        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]>nums[e]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public int binarySearch(int[] nums, int target ,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }   
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(target>=nums[0] && target<=nums[pivot]){
            return binarySearch(nums,target,0,pivot);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
}
