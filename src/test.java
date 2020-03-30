public class test {
    public static void main(String[] args) {
        int[] nums={2,1,3,0,5};
        QuickSort qs=new QuickSort();
        qs.quickSort(nums,0,4);
        for (int i:nums){
            System.out.println(i);
        }
    }
}
