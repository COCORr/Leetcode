public class QuickSort {
    public void quickSort(int[] nums,int left, int right){
        int i,j,index;
        if (left>right){
            return;
        }

        i=left;
        j=right;
        index=nums[i];

        while (i<j){
            while (i<j && nums[j]>=index){
                j--;
            }
            if (i<j){
                nums[i++]=nums[j];
            }
            while (i<j && nums[i]<=index){
                i++;
            }
            if (i<j){
                nums[j--]=nums[i];
            }
        }
        nums[i]=index;
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }
}
