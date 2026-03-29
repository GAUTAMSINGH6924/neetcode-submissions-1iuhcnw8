class Solution {

    public int binarySearch(int[] nums,int s,int e,int target){
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
        int s=0;
        int e=nums.length-1;
        int pivot=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if( mid<nums.length-1 &&nums[mid]>nums[mid+1]){
                pivot=mid;
                break;
            }
            else if(mid>0&&nums[mid-1]>nums[mid]){
                pivot=mid-1;
                break;
            }
            else if(nums[mid]>=nums[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

        if(target>=nums[0]&&target<=nums[pivot]){
            return binarySearch(nums,0,pivot,target);
        }
        else{
            return binarySearch(nums,pivot+1,nums.length-1,target);
        }

    }
}
