class Solution {
    
    public static long countPairs(int[] nums, int l, int mid, int r){
        
        int left=l, right=mid+1;
        long count=0;
        while(left<=mid && right<=r){
            if((long) nums[left] > 2 * (long) nums[right]){
                count+=mid-left+1;
                right++;
                
            }
            else left++;
        }
        return count;
    }
    
    public static void merge(int[] nums, int l, int mid, int r){
        int left=l, right=mid+1;
        ArrayList<Integer> list = new ArrayList<>();

        while(left<=mid && right<=r){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=r){
            list.add(nums[right]);
            right++;
        }
        for (int i = l; i <= r; i++) {
            nums[i] = list.get(i - l);
        }   
    }

    public static long mergeSort(int[] nums, int l, int r){
        
        //base stop condition
        if(l>=r) return 0;
        
        int mid = l + (r - l) / 2;
        long count = 0;
        count+=mergeSort(nums, l, mid);
        count+=mergeSort(nums, mid+1, r);
        count+=countPairs(nums,l,mid,r);
        merge(nums,l,mid,r);
        return count;
    }
    
    public int reversePairs(int[] nums) {
        return (int) mergeSort(nums, 0, nums.length-1);
    }
}