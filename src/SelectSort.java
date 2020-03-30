public class SelectSort {

    public void selectSort(int[] nums){
        if (nums==null||nums.length==0){
            return;
        }

        int len=nums.length;
        for (int i = 0; i < len - 1; i++) {
            int max = i;

            for (int j = i + 1; j < len; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }

            if (max != i) {
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
            }
        }
    }
}
