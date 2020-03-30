import java.util.Comparator;
import java.util.PriorityQueue;

public class Search {
    public int search(int[] nums, int target) {
        int lens=nums.length;
        int left=0;
        int right=lens-1;
        int mid=(left+right)/2;

        while(left<=right){
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                left=mid+1;
                mid=(left+right)/2;
            }else {
                right=mid-1;
                mid=(left+right)/2;
            }
        }

        return -1;
    }
}
