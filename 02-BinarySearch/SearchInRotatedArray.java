class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot =findPivot(nums);
        if(target >= nums[pivot] && target <= nums[n-1] ){
            return bS(nums, pivot , n-1, target);
        } else{
            return bS(nums, 0 , pivot-1, target);
        }
        
        
    }
    public int findPivot(int[] nums){
        int s = 0;
        int end = nums.length -1;
        while(s< end){
            int mid = s + (end-s)/2;
            if(nums[mid] > nums[end]){
                s = mid +1;
            }else{
                end = mid;
            }
        }
        return s;
    }
    public int bS(int[] nums, int s , int e , int target){
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                e = mid -1;

            }else{
                s = mid  +1;
            }
            

        }
        return -1;
    }
}
