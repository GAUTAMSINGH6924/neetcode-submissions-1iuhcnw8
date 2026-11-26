class Solution {
    public int binarySearch(int[] nums, int target,int s,int e){
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
    public int findPivot(int[] nums){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(mid+1<nums.length && nums[mid]>nums[mid+1]){
                ans=mid;
                break;
            }
            else if(mid-1>=0 && nums[mid-1]>nums[mid]){
                ans=mid-1;
                break;
            }
            else if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int pivot=-1;

        pivot=findPivot(nums);
        int result=-1;
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(target>=nums[0] && target<=nums[pivot]){
            result=binarySearch(nums,target,0,pivot);
        }
        else{
            result=binarySearch(nums,target,pivot+1,nums.length-1);
        }

        return result;
    }
}



